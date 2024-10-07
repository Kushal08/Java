package com.spring.core.referenceInjection;

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
        ApplicationContext app = new ClassPathXmlApplicationContext("com/spring/core/referenceInjection/appconfig.xml");
        A bean = (A) app.getBean("aref");
        System.out.println(bean);
    }
}
