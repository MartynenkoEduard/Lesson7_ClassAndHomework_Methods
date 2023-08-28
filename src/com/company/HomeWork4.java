package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    /**
     * 4. Напишите метод, который в качестве аргумента принимает одномерный
     * целочисленный массив, и сортирует его “Методом пузырька”. Также
     * напишите отдельный метод, для вывода массива на экран.
     */
    public static void bubleSort() {
        System.out.println( " Enter array length : ");
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int [] arrayOfInt = new int[elements];
        System.out.println("Insert array elements : ");
        for (int i = 0; i < elements; i++) {
            arrayOfInt[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arrayOfInt));

        boolean flag ;
        do {
            flag = false;
            for (int i = 1; i < arrayOfInt.length; i++) {
                if (arrayOfInt[i ] < arrayOfInt[i-1] ) {
                    int temp = arrayOfInt[i];
                    arrayOfInt[i] = arrayOfInt[i-1];
                    arrayOfInt[i-1] = temp;
                    flag = true;
                    break;
                }
            }
        }
        while (flag == true);
        System.out.println(Arrays.toString(arrayOfInt));

    }

    public static void printArray(int[] array) {
        System.out.println("Print array : ");
        System.out.println(Arrays.toString(array));
    }
}

