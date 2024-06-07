package com.spring.SpringDemo;

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
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        
        Alien alien1 = (Alien) factory.getBean("alien");
        alien1.code();

        System.out.println(alien1.getAge());
        
//        Alien alien2 = (Alien) factory.getBean("alien");
//        alien2.code();
//        System.out.println(alien2.age);
    }
}
