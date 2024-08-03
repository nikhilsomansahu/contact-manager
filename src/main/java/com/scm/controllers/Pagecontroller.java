package com.scm.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Pagecontroller {

@RequestMapping("/index")
public String index(){
    System.out.println("Home Page Handler");
    return "index";

}

}
