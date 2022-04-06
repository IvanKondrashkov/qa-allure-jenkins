package ru.yandex.praktikum;

import io.qameta.allure.Allure;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
        Allure.addAttachment("name : ", name);
    }

    public boolean checkNameToEmboss() {
        if (name == null) {
            return false;
        } else if (name.matches("(?=.{3,19}$)[a-zA-Zа-яА-ЯёЁ]+\\s[a-zA-Zа-яА-ЯёЁ]+")) {
            return true;
        }
        return false;
    }
}
