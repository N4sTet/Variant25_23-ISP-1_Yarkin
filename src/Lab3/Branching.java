package Lab3;

import java.util.Scanner;

public class Branching {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nВведите номер задания: ");
            int zadanie = scanner.nextInt();
            switch (zadanie) {
                case 1:
                    System.out.println("Задача 7: Температурная характеристика");
                    System.out.print("Введите температуру в градусах Цельсия: ");
                    int temp = scanner.nextInt();

                    if (temp <= 0) {
                        System.out.println("freezing");
                    } else if (temp <= 15) {
                        System.out.println("cold");
                    } else if (temp <= 25) {
                        System.out.println("mild");
                    } else {
                        System.out.println("hot");
                    }
                    break;

                case 2:

                    System.out.println("Задача 20: Треугольник по сторонам");
                    System.out.println("Введите стороны треугольника построчно(a b c): ");

                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = scanner.nextInt();

                    if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
                        System.out.println("yes");
                    } else {
                        System.out.println("no");
                    }

                    break;

                case 3:
                    System.out.println("Задача 2: Чётность числа");
                    System.out.print("Введите число: ");
                    int number = scanner.nextInt();

                    String par = (number % 2 == 0) ? "even" : "odd";
                    System.out.println(par);
                    break;
            }
        }
    }
}
