package com.webbackend.api_exemplo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculadoraController {

    @GetMapping("/somar")
    public double somar(@RequestParam List<Double> numeros) {
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        return soma; //http://localhost:8080/somar?numeros=10&numeros=10
    }

    @GetMapping("/subtrair")
    public double subtrair(@RequestParam List<Double> numeros) {
        double subtracao = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            subtracao -= numeros.get(i);
        }
        return subtracao; //http://localhost:8080/subtrair?numeros=10.2&numeros=20
    }

    @GetMapping("/multiplicar")
    public double multiplicar(@RequestParam List<Double> numeros) {
        double multiplicacao = 1;
        for (double numero : numeros) {
            multiplicacao *= numero;
        }
        return multiplicacao;//http://localhost:8080/multiplicar?numeros=20&numeros=2&numeros=2
    }

    @GetMapping("/dividir")
    public String dividir(@RequestParam List<Double> numeros) {
        double resultado = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) == 0) {
                return "Erro: Divisão por zero não permitida.";//http://localhost:8080/dividir?numeros=20&numeros=0
            }
            resultado /= numeros.get(i);
        }
        return String.valueOf(resultado);//http://localhost:8080/dividir?numeros=20&numeros=2
    }
}
