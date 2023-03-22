package com.example.demo.configuration;

import com.example.demo.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    /*
    // los bean configuration es la forma en la que nosotros administramos cuales son los bean
    que se van a inicializar
    es decir que desde aca lo usamos como nuestro container para hacer nuestra
    IoC (inversion de control)
    @Bean
    public MyBean beanOperation(){
        return new BeanImplement();
    }*/

    @Bean
    public MyBean beanOperation(){
        return new BeanImplement2();
    }

    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationimplement();
    }

    @Bean
    public MyBeanWithDependency myOperationImplement(MyOperation myOperation){
        return new MyBeanWithDependencyImplement(myOperation);
    }
}
