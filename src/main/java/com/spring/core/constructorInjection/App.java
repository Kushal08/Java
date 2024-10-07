package com.spring.core.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext app = new ClassPathXmlApplicationContext("com/spring/core/constructorInjection/appconfig.xml");
        Person bean1 = (Person) app.getBean("person2");
        System.out.println(bean1);
        
        AmbigiousCall bean2 = (AmbigiousCall) app.getBean("add");
        bean2.doSum();
    }
}
