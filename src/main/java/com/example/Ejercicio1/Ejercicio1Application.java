package com.example.Ejercicio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;


//@ActiveProfiles(value = "Perfil1")
@SpringBootTest("spring.profiles.active=Perfil1")

@SpringBootApplication
public class Ejercicio1Application {
	@Autowired
	private Environment environment;

	@Autowired
	Configuracion configuracion;
	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1Application.class, args);
	}
/*  // Ya se inicializan por que encuentra la clase
	@Bean
	@Profile("Perfil1")
	IPerfiles getPerfil1(){
		return new Perfil1();
	}

	@Bean
	@Profile("Perfil2")
	IPerfiles getPerfil2(){
		return new Perfil2();
	}
*/


	@Bean
	public void imprimirVariables(){
		System.out.println("Las variables son: "+configuracion.getValor1()+" "+configuracion.getValor2());
	}
}
