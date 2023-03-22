package com.example.demo.component;


import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class ComponentImplement implements ComponentDependency {
    @Override
    public void saludo() {
        System.out.println("Hola Mundo");
    }
}
