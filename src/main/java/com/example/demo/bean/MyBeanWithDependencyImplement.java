package com.example.demo.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{


    //dependencía que es inyectada por otra dependencia
    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency(){
        System.out.println(myOperation.sum(5));
        System.out.println("hola desde la implementacion desde la impelentacion de un bin");
    }
}
