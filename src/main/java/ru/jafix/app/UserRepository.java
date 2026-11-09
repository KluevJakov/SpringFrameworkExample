package ru.jafix.app;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public void save() {
        System.out.println("Сохранили юзера в БД");
    }
}
