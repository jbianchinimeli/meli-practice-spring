package com.jbianchini.meli.romans.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convert")
public class RomansController {

    @GetMapping("/{number}")
    public String convertIntToRoman(@PathVariable final String number) {
        System.out.println("AAAAAAAAAAA");
        return number;
    }
}