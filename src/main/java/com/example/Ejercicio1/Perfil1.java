package com.example.Ejercicio1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Perfil1") // tiene en cuenta esta clase si es de este perfil
public class Perfil1 implements  IPerfiles{
    String perfil="Perfil1";

    @Override
    public void miFuncion(){
        System.out.println("Es el perfil: "+this.perfil);
    }

    @Override
    public String getPerfil(){
        return this.perfil;
    }

}
