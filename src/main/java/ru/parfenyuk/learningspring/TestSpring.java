package ru.parfenyuk.learningspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //данный класс читает файл applicationContext.xml и помещает бины в application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        context.close();
    }
}