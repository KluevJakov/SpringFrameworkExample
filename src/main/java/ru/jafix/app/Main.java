package ru.jafix.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ru.jafix.app");
        UserService userService = context.getBean(UserService.class);
        userService.save();
    }
}
