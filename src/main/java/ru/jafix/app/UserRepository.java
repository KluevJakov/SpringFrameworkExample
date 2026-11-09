package ru.jafix.app;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    public void save() {
        System.out.println("Сохранили юзера в БД");
    }
}
