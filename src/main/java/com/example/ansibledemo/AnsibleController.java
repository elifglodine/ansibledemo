package com.example.ansibledemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnsibleController {

    @Autowired
    private PythonScriptService pythonScriptService;

    @PostMapping("/run-ansible")
    public String runAnsible() {
        pythonScriptService.runAnsible();
        return "Ansible playbook executed successfully!";
    }
}