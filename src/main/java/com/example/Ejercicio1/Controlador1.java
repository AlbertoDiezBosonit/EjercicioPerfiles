package com.example.Ejercicio1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador1 {
    @Autowired
    Configuracion configuracion;

    @GetMapping()
    public String index(){
        return "Hola";
    }

    @GetMapping ("miconfiguracion")
    public String miConfiguracion(){
        return "La configuración es: "+configuracion.getValor1()+" "+configuracion.getValor2();
    }


    @Value("${url}")
    private String url;

    @Value("${password}")
    private String password;

    @GetMapping ("parametros")
    public String parametros(){
        return "La configuración es: url: "+url+" password: "+password;
    }

    @GetMapping ("perfil")
    public String parametrosPerfil(){
        perfil.miFuncion();
        return "El perfil actual es: "+perfil.getPerfil();
    }

    @Autowired
    IPerfiles perfil;
}
