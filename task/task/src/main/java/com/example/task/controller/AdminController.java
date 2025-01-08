package com.example.task.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    @PostMapping
    public void createManager(){
        System.out.println("Create Manager");
    }

    @PostMapping
    public void createStore(){
        System.out.println("Create Store");
    }

    @GetMapping
    public void getTasksList(){
        System.out.println("Get Tasks List");
    }

}
