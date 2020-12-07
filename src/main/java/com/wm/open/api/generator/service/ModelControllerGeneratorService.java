package com.wm.open.api.generator.service;

import com.wm.open.api.generator.dao.StateLotteryTxnRepository;
import com.wm.open.api.generator.model.StateLotteryTxn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by s0t01a5
 */

@Service
public class ModelControllerGeneratorService {

    @Autowired
    StateLotteryTxnRepository stateLotteryTxnRepository;


    public void generateModelAndControllers() {

        List<StateLotteryTxn> top100ByRetailerId = stateLotteryTxnRepository.findTop100ByRetailerId(326323);
        System.out.println(top100ByRetailerId.toString());

    }
}
