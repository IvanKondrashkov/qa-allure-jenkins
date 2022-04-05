package ru.yandex.praktikum;

import io.qameta.allure.Epic;
import org.junit.Test;
import io.qameta.allure.junit4.DisplayName;
import static org.junit.Assert.*;

@Epic("Create account card")
public class AccountTest {
    private final String name = "Тимоти Шаламе";

    @Test
    @DisplayName("Create account valid name")
    public void createAccountValidName() {
        Account account = new Account(name);

        assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Create account invalid name")
    public void createAccountInvalidName() {
        Account account = new Account(name.concat(name));

        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Create account is empty name")
    public void createAccountIsEmptyName() {
        Account account = new Account(" ");

        assertFalse(account.checkNameToEmboss());
    }
}
