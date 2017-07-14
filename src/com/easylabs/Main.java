package com.easylabs;

import java.util.Scanner;

public class Main {

    private static void Example1() {
        int a = 0;
        int b = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a : ");
        a = scanner.nextInt();

        System.out.print("Enter b : ");
        b = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }

    private static void Example2() {
        int lenghtKatet = 0;

        Scanner scanner = new Scanner(System.in);

        lenghtKatet = scanner.nextInt();

        for (int i = 0; i < lenghtKatet; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    private static void Example3() {
        int MIDDLE = 10;

        int width = 0;
        while (width < MIDDLE) {
            for (int i = 0; i < MIDDLE - width; i++) {
                System.out.print(" ");  // поставьте здесь вместо пробела i, чтобы проверить, что середина на 20-м символе
            }
            for (int i = 0; i < width * 2 + 1; i++) {
                System.out.print("#");
            }
            System.out.println();
            width++;
        }
    }

    private static void Example4() {
        int number = 0; // только для трехназных чисел
        int a = 0;
        int b = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number : ");
        number = scanner.nextInt();

        System.out.print("Enter a : ");
        a = scanner.nextInt();

        System.out.print("Enter b : ");
        b = scanner.nextInt();

        int firstNum = number / 100; // сотые
        int secondNum = (number - 100 * firstNum) / 10; // десятые
        int thirdNum = (number - 100 * firstNum) - 10 * secondNum; // единицы

        int countOfA = 0;
        int countOfB = 0;

        if (firstNum == a) {
            ++countOfA;
        }
        if (secondNum == a) {
            ++countOfA;
        }
        if (thirdNum == a) {
            ++countOfA;
        }

        if (firstNum == b) {
            ++countOfB;
        }
        if (secondNum == b) {
            ++countOfB;
        }
        if (thirdNum == b) {
            ++countOfB;
        }

        if (countOfA < countOfB) {
            System.out.println("Число a встречается реже чем b");
        } else {
            System.out.println("Число b встречается реже чем a, или их одинаковое количество");
        }
    }

    private static void Example5() {
        int num = 3123;

        for (int i = 1; num != 0; i++) {
            int res = num % 10 * i / (int) Math.pow(10, i - 1);
            num = num - res * (int) Math.pow(10, i - 1);
        }
    }

    private static void Example6() {
        // Найти 15 первых натуральных чисел, делящихся нацело на 19 и больших 100.
        int count = 0;

        for (int i = 101; count <= 15; i++) {
            if (i % 19 == 0) {
                System.out.println(i);
                ++count;
            }
        }
    }

    public static void main(String[] args) {
    }


}
