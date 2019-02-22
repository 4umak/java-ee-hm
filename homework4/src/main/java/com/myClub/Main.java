package com.myClub;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FootballTeam ft1 = (FootballTeam) context.getBean("ft1");
        System.out.println(ft1);
        context.close();
    }
}
