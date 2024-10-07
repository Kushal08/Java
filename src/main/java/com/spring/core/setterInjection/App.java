package com.spring.core.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext app = new ClassPathXmlApplicationContext("com/spring/core/setterInjection/appconfig.xml");
        Student student1 = (Student) app.getBean("student1");
        System.out.println(student1);
        
        Student student2 = (Student) app.getBean("student2");
        System.out.println(student2);
        
    }
}
