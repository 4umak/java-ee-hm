package com.chumak;

import com.chumak.annotations.IPerformer;
import com.chumak.xml.Magician;
import com.chumak.xml.Thinker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppStart {


    public static void main(String[] args) {
        System.out.println("annotations try:");
        annotations();
        System.out.println("xml try:");
        xml();
    }


    public static  void annotations() {
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
        annotationContext.register(AppContext.class);
        annotationContext.refresh();

        IPerformer noThPerformer = (IPerformer) annotationContext.getBean("noThrowingPerformer");
        IPerformer thPerformer = (IPerformer) annotationContext.getBean("throwingPerformer");
        try {
            noThPerformer.perform();
            thPerformer.perform();
        } catch (Exception ignored) {
        }
    }

    public static void xml() {
        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("aspectJ.xml");
        Thinker volunteer = (Thinker) xmlContext.getBean("volunteer");
        Magician magician = (Magician) xmlContext.getBean("magician");
        volunteer.thinkOfSomething("I'm THINKING ...");
        try {
            System.out.println(magician.getThoughts());
        } catch (Exception ignored) {
        }
    }
}