package com.company;

public class HomeWork1 {
    /**
     * 1. Представьте, что вы реализуете программу для банка, которая помогает
     * определить, погасил ли клиент кредит или нет. Допустим, ежемесячная сумма
     * платежа должна составлять 100 грн. Клиент должен выполнить 7 платежей, но
     * может платить реже большими суммами. Т.е., может двумя платежами по 300
     * и 400 грн. Закрыть весь долг. Создайте метод, который будет в качестве
     * аргумента принимать сумму платежа, введенную экономистом банка. Метод
     * выводит на экран информацию о состоянии кредита (сумма задолженности,
     * сумма переплаты, сообщение об отсутствии долга).
     */
    public static String maturityOfTheLoan(double payment) {


        System.out.println(" Input amount of payment : " + payment);
        double sumOfLoan = 1000;
        String str = "";

        double residueOfLoan = sumOfLoan - payment;
        if (residueOfLoan > 0) {
            str = " The remainder of the debt : " + residueOfLoan;
        } else if (residueOfLoan == 0) {
            str = "Congratulation . You matured loan ";
        } else if (residueOfLoan < 0) {
            str = " We should give you back: " + -residueOfLoan;
        }
        System.out.println(str);
        return  str;
    }
}



