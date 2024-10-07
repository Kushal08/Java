package com.spring.core.lifecycles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext app = new ClassPathXmlApplicationContext("com/spring/core/lifecycles/appconfig.xml");
        Book book1 = (Book) app.getBean("book1");
        System.out.println(book1);
 
        BookWithInterface book2 = (BookWithInterface) app.getBean("book2");
        System.out.println(book2);
 
        BookWithAnnotation book3 = (BookWithAnnotation) app.getBean("book3");
        System.out.println(book3);
        
        // Need to enable preshutdown hook to call destroy method, ApplicationContext doesn't have that method.
        // Need to use AbstractApplicationContext, init & destroy can be of any name, but function signature should be same.
        app.registerShutdownHook();
        
    }
}
