package Lessons.lesson23.hw;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    //Завдання 2:
    // Розробіть додаток, який дозволяє зберігати інформацію про логіни і паролі користувачів.
    // Кожному користувачу відповідає пара "логін — пароль".
    // При старті додатку відображається меню:
    // 1. Додати нового користувача.
    // 2. Видалити існуючого користувача.
    // 3. Перевірити, чи існує такий користувач.
    // 4. Змінити логін існуючого користувача.
    // 5. Змінити пароль існуючого користувача.
    // Дія виконується залежно від вибору користувача,
    // після чого меню з'являється знову.
    // Для вирішення завдання використовуйте відповідний клас з Java Collections Framework.
    public static void main(String[] args) {
        List<User>users = new ArrayList<>();

        users.add(new User("Login", "password"));
    }
}
