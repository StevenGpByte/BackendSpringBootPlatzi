package com.example.demo.component;

import org.springframework.stereotype.Component;

@Component(value = "componentTwoImplement")
public class ComponentTwoimplement implements ComponentDependency{

    @Override
    public void saludo() {
        System.out.println("Hola mundo 2");
    }
}
