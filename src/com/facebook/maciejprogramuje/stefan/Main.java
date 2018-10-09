package com.facebook.maciejprogramuje.stefan;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cities = Integer.valueOf(scanner.nextLine());
        BigInteger moneyFromCity = new BigInteger(scanner.nextLine());
        BigInteger moneyTotal = moneyFromCity;
        for (int i = 1; i < cities; i++) {
            BigInteger tempMoney = new BigInteger(scanner.nextLine());
            moneyFromCity = tempMoney.max(tempMoney.add(moneyFromCity));
            moneyTotal = moneyTotal.max(moneyFromCity);
        }
        if(moneyTotal.compareTo(BigInteger.ZERO) < 0) {
            moneyTotal = BigInteger.ZERO;
        }
        System.out.println(moneyTotal);
    }
    // Kadane's algorithm
}
