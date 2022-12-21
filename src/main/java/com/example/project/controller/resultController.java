package com.example.project.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class resultController {

    @GetMapping("/statistics")
    public String statistics(Model model){
        return "resultDB/statistics";
    }

    @GetMapping("/machine_Learning")
    public String machine_Learning(Model model){
        return "resultDB/machine_Learning";
    }
}
