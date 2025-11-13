package Lab2;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        System.out.println("Начните вводить числа...");

        while (true) {
            System.out.print("Введите число: ");
            double input = scanner.nextDouble();

            if (input == 0) {
                break;
            }

            sum += input;
        }

        System.out.println("Сумма введенных чисел: " + sum);
        scanner.close();
    }
}
