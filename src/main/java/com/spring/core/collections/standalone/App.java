package com.spring.core.collections.standalone;

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
        ApplicationContext app = new ClassPathXmlApplicationContext("com/spring/core/collections/standalone/appconfig.xml");
        Emp bean = (Emp) app.getBean("emp");
        System.out.println(bean.getFriends());
        System.out.println(bean.getFees());
        System.out.println(bean.getProps());
        System.out.println(bean.getFriends().getClass().getName());

        
    }
}
