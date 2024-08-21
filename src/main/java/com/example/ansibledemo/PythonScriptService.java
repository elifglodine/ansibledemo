package com.example.ansibledemo;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.stereotype.Service;


@Service
public class PythonScriptService {

    private static final String ANSIBLE_PLAYBOOK_PATH = "playbook.yaml"; // Path to your Ansible playbook

    public void runAnsible() {
        try {
            runAnsiblePlaybook();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void runAnsiblePlaybook() throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder(
                "ansible-playbook", ANSIBLE_PLAYBOOK_PATH);
        processBuilder.inheritIO();
        Process process = processBuilder.start();
        process.waitFor();
        System.out.println("Ansible playbook executed successfully!");
    }
}