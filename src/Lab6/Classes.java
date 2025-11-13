package Lab6;

import Lab6.LoginAttempt.*;
import java.util.Scanner;

public class Classes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LoginAttempt a = new LoginAttempt();

        System.out.println("Введите имя пользователя и количество попыток:");
        String name = scanner.nextLine();
        int at = scanner.nextInt();

        LoginAttempt b = new LoginAttempt(name, at);

        LoginAttempt c = new LoginAttempt(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("Состояние пользователя: " + b.status());
        System.out.println(c.shouldLock() == false? "Попытка не заблокирована":"Попытка заблокирована");

    }
}
