package com.webbackend.laboratorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LaboratorioApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaboratorioApplication.class, args);
	}

}

/*
 CONSULTAS
 SELECT * FROM medicamento;
 SELECT * FROM medicamento WHERE id = 1;
 SELECT * FROM medicamento WHERE nome = 'Paracetamol';
 SELECT * FROM medicamento WHERE nome LIKE '%rona%';
 SELECT * FROM medicamento WHERE laboratorio = 'Farmalab';
 SELECT * FROM medicamento WHERE data_validade < '2026-09-05';
 */