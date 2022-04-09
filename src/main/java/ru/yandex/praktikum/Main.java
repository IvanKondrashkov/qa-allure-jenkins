package ru.yandex.praktikum;

public class Main {
    public static void main(String[] args) {
        Account accountShalome = new Account("Тимоти Шаламе");
        accountShalome.checkNameToEmboss();

        Account accountChevrolet = new Account("ТимотейШевроле");
        accountChevrolet.checkNameToEmboss();
    }
}
