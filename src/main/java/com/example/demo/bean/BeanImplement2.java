package com.example.demo.bean;

public class BeanImplement2 implements MyBean{
    @Override
    public void print() {
        System.out.printf("Hola mundo desde la dependencia");
    }
}
