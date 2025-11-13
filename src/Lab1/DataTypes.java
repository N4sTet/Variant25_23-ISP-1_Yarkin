package Lab1;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        while (true) {
            System.out.print("\nВведите номер задания: ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            switch (input) {
                case 1:

                    int radius1 = 5, height = 10;
                    System.out.println("Площадь боковой поверхности цилиндра: " + Math.round(2 * Math.PI * radius1 * height  )  + " см2");
                    break;

                case 2:

                    String janr = "Фантастика";
                    System.out.println("Любимый литературный жанр: " + janr);
                    break;

                case 3:

                    double PI = 3.1415, radius2 = 7.5;
                    System.out.println("Площаль круга радиусом 7.5 см: " + PI * Math.pow(radius2, 2) + " см2");
                    break;

                default:

                    System.out.println("Неверный номер задания");
                    break;
            }
        }
    }
}
