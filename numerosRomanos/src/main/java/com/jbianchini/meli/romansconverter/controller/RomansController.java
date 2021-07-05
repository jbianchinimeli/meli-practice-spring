package com.jbianchini.meli.romansconverter.controller;

import com.jbianchini.meli.romansconverter.service.RomanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convert")
public class RomansController {

    @Autowired
    RomanService romanService;

    @GetMapping("/{number}")
    public String convertIntToRoman(@PathVariable final Integer number) {
        return romanService.convert(number);
    }
}
