package org.example.controller;

import org.example.service.GitService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {

    @Autowired
    private GitService gitService;

    public String getTest() {
        return gitService.test();
    }

    @RequestMapping("/v1")
    public String v1() {
        return "v1v1v1";
    }
}
