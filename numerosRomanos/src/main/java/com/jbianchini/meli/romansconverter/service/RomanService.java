package com.jbianchini.meli.romansconverter.service;

import com.jbianchini.meli.romansconverter.util.IntegerToRomanConverter;
import org.springframework.stereotype.Service;

@Service
public class RomanService {

    public String convert(Integer intNumber){
        return IntegerToRomanConverter.toRoman(intNumber);
    }
}
