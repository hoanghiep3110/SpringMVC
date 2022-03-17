/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Hiệp Phan
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() { 
        return "index";
    }
    
    @RequestMapping("/about")
    public String About() {
        return "about";
    }
    
    @RequestMapping("/product")
    public String product() { 
        return "product";
    }
    
    @RequestMapping("/product-detail")
    public String productdetail() { 
        return "productdetail";
    }
    
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    
    @RequestMapping("/contact")
    public String Contact() { 
        return "contact";
    }
}
