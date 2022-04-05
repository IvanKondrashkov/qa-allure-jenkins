package ru.yandex.praktikum;

import io.qameta.allure.Allure;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
        addAttachment();
    }

    private void addAttachment() {
        Allure.addAttachment("name : ", name);
    }

    public boolean checkNameToEmboss() {
        boolean isFlag = false;
        long count = name.chars().filter(Character::isWhitespace).count();

        if (!name.startsWith(" ") && !name.endsWith(" ") && count == 1) {
            if (name.length() >= 3 && name.length() <= 19) {
                isFlag = true;
            }
        }
        return isFlag;
    }
}
