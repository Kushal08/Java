package com.spring.core.stereotype;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        ApplicationContext app = new ClassPathXmlApplicationContext("com/spring/core/stereotype/appconfig.xml");
        Student student = (Student) app.getBean("student");
        System.out.println(student);
        System.out.println(student.hashCode());
        Student student1 = (Student) app.getBean("student");
        System.out.println(student1.hashCode()); // both hashcodes are same, as singleton scope is followed.

        Point point = app.getBean("point", Point.class);
        System.out.println(point);
        
    }
}
