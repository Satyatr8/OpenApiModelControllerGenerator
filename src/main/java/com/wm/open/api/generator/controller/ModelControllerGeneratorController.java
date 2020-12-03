package com.wm.open.api.generator.controller;

import com.wm.open.api.generator.service.ModelControllerGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by s0t01a5
 */

@RestController
public class ModelControllerGeneratorController {

    @Autowired
    ModelControllerGeneratorService modelControllerGeneratorService;


    @PostMapping("/generateModelController")
    public String generateModelController() {

        modelControllerGeneratorService.generateModelAndControllers();

        return "generated";

    }


}
