package com.company;

public class HomeWork5 {

    /**
     * 5. Напишите метод, который принимает 2 аргумента : целочисленный массив, и
     * целочисленное число. В методе организуйте проверку, содержит ли массив это
     * число. Метод должен возвращать логическое значение (true – содержит, false –
     * не содержит). Создайте перегрузку этого метода, который в качестве первого
     * аргумента принимает массив элементов типа double, а в качестве второго
     * аргумента принимает аргумент типа double .
     */
    public static boolean method(int array[], int numberToFindIn) {
//        int [] arr = {1, 2, 3, 5, 4, 7, 8, 9 };
//        int numberToFindIn = 5;
        boolean isContain = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToFindIn) {
                isContain = true;
                break;
            }
        }
        System.out.println(" Array contain INTEGER matching number :  " + isContain);
        return isContain;

    }

    public static boolean method(double array[], double numberToFindIn) {
        final double EPSILON = 0.0000001;

//        int [] arr = {1, 2, 3, 5, 4, 7, 8, 9 };
//        int numberToFindIn = 5;
        boolean isContain = false;
        for (int i = 0; i < array.length; i++) {

            if (Math.abs(array[i] - numberToFindIn) < EPSILON) {
                isContain = true;
                break;
            }
        }
        System.out.println(" Array contain DOUBLE matching number :  " + isContain);
        return isContain;

    }
}


