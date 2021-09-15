package com.example.Ejercicio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ejercicio1Application {
	@Autowired
	Configuracion configuracion;
	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1Application.class, args);
	}

	@Bean
	public void imprimirVariables(){
		System.out.println("Las variables son: "+configuracion.getValor1()+" "+configuracion.getValor2());
	}
}
