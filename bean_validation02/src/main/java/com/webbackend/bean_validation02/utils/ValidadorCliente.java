package com.webbackend.bean_validation02.utils;

import com.webbackend.bean_validation02.models.Cliente;
import jakarta.validation.*;

import java.time.LocalDate;
import java.util.Set;

public class ValidadorCliente {
    public static void main(String[] args) {
        Cliente clienteInvalido = new Cliente(
                null,
                "Jo",                      
                "email-invalido",         
                "123456789",               
                LocalDate.now().plusDays(1), 
                "12345"                    
        );

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<Cliente>> violacoes = validator.validate(clienteInvalido);

        if (violacoes.isEmpty()) {
            System.out.println("Cliente válido.");
        } else {
            for (ConstraintViolation<Cliente> v : violacoes) {
                System.out.println(v.getPropertyPath() + ": " + v.getMessage());
            }
        }
    }
}
