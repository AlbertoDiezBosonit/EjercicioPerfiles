package com.example.Ejercicio1;

import org.springframework.stereotype.Component;

@Component
public class Perfil1 implements  IPerfiles{
    String perfil="Perfil1";

    @Override
    public void miFuncion(){
        System.out.println("Es el perfil: "+this.perfil);
    }
}
