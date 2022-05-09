package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        //load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myGolfCoach", Coach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkOut());

        //close the context
        context.close();

    }
}
