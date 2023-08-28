package com.company;

import java.util.Scanner;

public class HomeWork3 {

    /**
     * 3. Напишите метод, который будет определять:
     * 1) является ли введенное число положительным или отрицательным.
     * 2) Является ли оно простым (используйте технику перебора значений).
     * (Простое число — это натуральное число, которое делится на 1 и само на
     * себя. Чтобы определить простое число или нет, следует найти все его
     * целые делители. Если делителей больше 2-х, значит оно не простое.)
     * 3) Делится ли на 2, 5, 3, 6, 9 без остатка.
     */
    public static void numberProperties() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print number : ");
        int input = scanner.nextInt();

        boolean isPositive = false;
        boolean isSimple = true;
        boolean isDividedWithoutRest = false;

        if (input > 0)
            isPositive = true;

        for (int i = 2; i < Math.sqrt(input); i++) {
            if (input % i == 0) {
                isSimple = false;
                break;
            }
        }

       if (input % 2 == 0 && input % 3 ==0 && input % 5 == 0 && input % 6 == 0 && input % 9 ==0) {
           isDividedWithoutRest = true;
       }
        System.out.println(" is positive :  " + isPositive);
        System.out.println(" is simple :  " + isSimple);
        System.out.println(" is divided without rest : " + isDividedWithoutRest);


    }
}
