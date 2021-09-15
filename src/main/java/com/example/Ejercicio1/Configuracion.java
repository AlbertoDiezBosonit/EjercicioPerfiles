package com.example.Ejercicio1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Configuracion {
    public String getValor1() {
        return valor1;
    }

    public String getValor2() {
        return valor2;
    }

    @Value("${valor1}")
    private String valor1;

    public void setValor1(String valor1) {
       // this.valor1 = valor1;
    }

    public void setValor2(String valor2) {
       // this.valor2 = valor2;
    }

    @Value("${valor2}")
    private String valor2;
}
