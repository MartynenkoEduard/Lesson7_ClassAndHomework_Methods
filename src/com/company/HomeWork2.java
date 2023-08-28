package com.company;

import java.util.Scanner;

/**
 * 2. Напишите программу, которая будет выполнять конвертирование валют.
 * Пользователь вводит: сумму денег в определенной валюте, курс для
 * конвертации в другую валюту. Организуйте вывод результата операции
 * конвертирования валюты на экран.
 */
public class HomeWork2 {
    public static void currencyExchange() {
        double resultUAH = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Write sum of money in US dollars : ");
        double input = scanner.nextDouble();
        System.out.println(" Write exchange rate : ");
        double exchangeRate = scanner.nextDouble();
        resultUAH = input * exchangeRate;
        System.out.println("You will receive : " + resultUAH + " UA hryvnia's");

    }
}
