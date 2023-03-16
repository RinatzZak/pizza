package com.rinatzzak.pizza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PizzaController {
    @GetMapping("/pizza")
    public String pizzaList() {
        return "Hello! Look at this pizzaz!";
    }
}
