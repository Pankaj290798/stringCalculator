package com.stringCalculator;

import com.stringCalculator.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalController {

    @Autowired
    Addition addition;
    @Autowired
    Multiplication multiplication;
    @Autowired
    Division division;
    @Autowired
    Subtraction subtraction;

    @GetMapping("/sum")
    public int getSum(@RequestParam String numbers){
        return addition.add(numbers);
    }

    @GetMapping("/multiplication")
    public int getMultiplication(@RequestParam String numbers){
        return multiplication.multiply(numbers);
    }

    @GetMapping("/division")
    public int getDivision(@RequestParam String numbers){
        return division.division(numbers);
    }

    @GetMapping("/subtract")
    public int getSubtraction(@RequestParam String numbers){
        return subtraction.subtract(numbers);
    }

}
