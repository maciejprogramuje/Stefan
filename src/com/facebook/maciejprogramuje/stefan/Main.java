package com.facebook.maciejprogramuje.stefan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cities = Integer.valueOf(scanner.nextLine());
        int moneyFromCity = Integer.valueOf(scanner.nextLine());
        int moneyTotal = moneyFromCity;
        for (int i = 1; i < cities; i++) {
            int tempMoney = Integer.valueOf(scanner.nextLine());
            moneyFromCity = Math.max(tempMoney, moneyFromCity + tempMoney);
            moneyTotal = Math.max(moneyTotal, moneyFromCity);
        }
        if(moneyTotal < 0) {
            moneyTotal = 0;
        }
        System.out.println(moneyTotal);
    }
    // Kadane's algorithm
}
