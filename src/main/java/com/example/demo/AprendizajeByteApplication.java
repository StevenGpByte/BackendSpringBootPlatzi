package com.example.demo;

import com.example.demo.bean.MyBean;
import com.example.demo.bean.MyBeanWithDependency;
import com.example.demo.bean.MyOperation;
import com.example.demo.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AprendizajeByteApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;

	public AprendizajeByteApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency,MyBean myBean, MyBeanWithDependency myBeanWithDependency){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
	}
	public static void main(String[] args) {
		SpringApplication.run(AprendizajeByteApplication.class, args);
	}

	@Override
	public void run(String... args) {
		componentDependency.saludo();
		myBean.print();
		//la ejecucion de una dependencia que es inyectada por otra dependencia
		myBeanWithDependency.printWithDependency();

	}
}
