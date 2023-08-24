package com.example.POI;

import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequestMapping("/api")

public class CriaArquivo {

    @RequestMapping(value = "/escreve-arquivo", method = RequestMethod.GET)
    public String calculateFactorial(@RequestParam long number) {
        BigInteger factorial = calculate(number);
        return "O fatorial de " + number + " é: " + factorial.toString();
    }

    private BigInteger calculate(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}