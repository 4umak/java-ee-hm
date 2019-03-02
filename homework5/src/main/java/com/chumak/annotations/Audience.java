package com.chumak.annotations;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class Audience {

    @Pointcut("execution(* com.chumak.annotations.IPerformer.perform())")
    public void performance() {
    }

    @Before("performance()")
    public void takeSeats() { // Перед виступом
        System.out.println("The audience is taking their seats.");
    }

    @Before("performance()")
    public void turnOffCellPhones() { // Перед виступом
        System.out.println("The audience is turning off their cellphones");
    }

    @AfterReturning("performance()")
    public void applaud() { // Після виступу
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund() { // Після невдалого виступу
        System.out.println("Boo! We want our money back!");
    }
}