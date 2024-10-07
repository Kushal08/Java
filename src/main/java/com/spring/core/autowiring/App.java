package com.spring.core.autowiring;

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
        ApplicationContext app = new ClassPathXmlApplicationContext("com/spring/core/autowiring/appconfig.xml");
        Student student1 = (Student) app.getBean("student3");
        System.out.println(student1);
        
    }
}
