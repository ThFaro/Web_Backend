package com.webbackend.bean_validation01.utils;

import com.webbackend.bean_validation01.models.Produto;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.math.BigDecimal;
import java.util.Set;

public class ValidadorProduto {
    public static void main(String[] args) {
        Produto produtoInvalido = new Produto(
                null,                   
                "A",                   
                "Descrição válida",      
                new BigDecimal("-10"),   
                -5,                      
                null             
        );

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<Produto>> violacoes = validator.validate(produtoInvalido);

        if (violacoes.isEmpty()) {
            System.out.println("Produto válido.");
        } else {
            for (ConstraintViolation<Produto> violacao : violacoes) {
                System.out.println(violacao.getPropertyPath() + ": " + violacao.getMessage());
            }
        }
    }
}
