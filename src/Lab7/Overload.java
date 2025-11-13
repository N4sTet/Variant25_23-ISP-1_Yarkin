package Lab7;

import Lab7.Messenger.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Overload {
    public static void main(String[] args) {

        MessengerApp m = new MessengerApp("LAB7");

        System.out.println("\n" + m);
        m.notify("Hello world!");
        m.notify("Bye world.", 5);
        m.notify("Как дела?", "Васи");

        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String formTime = sdf.format(now);
        MessengerApp mess = new AdvancedMessengerApp("mess", "20.06.2024");

        AdvancedMessengerApp am = new AdvancedMessengerApp("LAB7", formTime);

        System.out.print("\nВведите сообщение: ");
        Scanner scanner = new Scanner(System.in);
        String mes = scanner.nextLine();

        System.out.println(am);
        am.notify(mes);
        scanner.close();
    }
}
