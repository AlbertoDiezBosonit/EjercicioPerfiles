package com.example.Ejercicio1;

import org.springframework.stereotype.Component;

@Component
public class Perfil2 implements IPerfiles{
    String perfil="Perfil2";

    @Override
    public void miFuncion(){
        System.out.println("Es el perfil: "+this.perfil);
    }
}
