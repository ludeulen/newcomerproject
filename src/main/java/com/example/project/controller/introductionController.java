package com.example.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class introductionController {

    @GetMapping("introduction")
    public String introduction(){
        return "explanation/introduction";
    }

    @GetMapping("project_introduction")
    public String project_introduction(){
        return "explanation/project_introduction";
    }

    @GetMapping("programme")
    public String programme(){
        return "explanation/programme";
    }

    @GetMapping("help_site")
    public String help_site(){
        return "explanation/help_site";
    }
}
