package ru.yandex.praktikum;

import org.junit.Rule;
import org.junit.Test;
import io.qameta.allure.Epic;
import org.junit.runner.RunWith;
import io.qameta.allure.junit4.DisplayName;
import org.junit.rules.ExpectedException;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@Epic("Create account card")
@RunWith(Parameterized.class)
public class AccountTest {
    private final String name;
    private final boolean expected;
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "name = {0}")
    public static Object[][] getNameData() {
        return new Object[][] {
                {"Тимоти Шаламе", true},
                {"Тимоти Шаламеeeeeee", true},
                {"Т Ш", true},
                {"ТимотейШевроле", false},
                {" ТимотейШевроле", false},
                {"ТимотейШевроле ", false},
                {" ТимотейШевроле ", false},
                {"Тимотей  Шевроле", false},
                {"ТШ", false},
                {"Тимотей Шевролеeeeeeeee", false},
                {"", false},
                {" ", false},
                {null, false}
        };
    }

    @Test
    @DisplayName("Check account name card")
    public void checkNameToEmboss() {
        Account account;
        if (name == null) {
            expectedException.expect(NullPointerException.class);
            account = new Account(name);
        } else {
            account = new Account(name);
        }

        assertEquals(expected, account.checkNameToEmboss());
    }
}
