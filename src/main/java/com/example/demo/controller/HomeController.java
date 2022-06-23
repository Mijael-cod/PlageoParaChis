/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
/**
 *
 * @author Mijael
 */
public class HomeController {
    
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("mensaje", "El mundo es ancho y ajeno");
        return "index";

    }
    
}
