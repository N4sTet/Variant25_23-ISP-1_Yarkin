package Lab4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива (N, ≤ 100): ");
        int n = scanner.nextInt();

        if (n <= 0 || n > 100) {
            System.out.println("Некорректный размер массива.");
            scanner.close();
            return;
        }

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = i + 1;
        }

        System.out.println("\nЗаполнение массива числами от 1 до N:");
        printArray(arr1);


        Random rand = new Random();
        int[] arr2 = new int[10];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rand.nextInt(100);
        }


        System.out.println("\nНахождение максимального элемента на чётной позиции:");
        int maxEvenPos = evenMaxPosition(arr2);

        System.out.print("Массив: ");
        printArray(arr2);
        System.out.println("Максимальный элемент на чётной позиции: " + maxEvenPos);


        scanner.close();
    }

    public static int evenMaxPosition(int[] a) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0 && a[i] > max) {
                max = a[i];
            }
        }

        return max;
    }
}
