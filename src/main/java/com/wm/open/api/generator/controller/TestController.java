package com.wm.open.api.generator.controller;

import com.wm.open.api.generator.service.ModelControllerGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by s0t01a5
 */

@RestController
public class TestController {

    @Autowired
    ModelControllerGeneratorService modelControllerGeneratorService;

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {

       modelControllerGeneratorService.generateModelAndControllers();

       return String.format("Hello %s!", name);
    }

}
