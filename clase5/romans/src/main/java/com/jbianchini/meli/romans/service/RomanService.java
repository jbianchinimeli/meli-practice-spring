package com.jbianchini.meli.romans.service;

import com.jbianchini.meli.romans.util.IntegerToRomanConverter;
import org.springframework.stereotype.Service;

@Service
public class RomanService {

    public String convert(Integer intNumber){
        return IntegerToRomanConverter.toRoman(intNumber);
    }
}
