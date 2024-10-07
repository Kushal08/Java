package com.spring.core.collections;

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
        ApplicationContext app = new ClassPathXmlApplicationContext("com/spring/core/collections/appconfig.xml");
        Emp bean = (Emp) app.getBean("emp1");
        System.out.println(bean.getName());
        System.out.println(bean.getPhones());
        System.out.println(bean.getAddress());
        System.out.println(bean.getCourses());
        System.out.println(bean.getProps());
        
        
    }
}
