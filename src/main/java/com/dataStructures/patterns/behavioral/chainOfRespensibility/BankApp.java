package com.dataStructures.patterns.behavioral.chainOfRespensibility;

import java.util.Scanner;

public class BankApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = menu();
        while (choice != 0) {
            if (choice == 1) {
                System.out.println("Введите сумму денег: ");
                int money = scanner.nextInt();
                takeMoney(money);
            } else {
                System.out.println("Попробуйте еще раз");
            }
            choice = menu();
        }
    }

    private static int menu() {
        System.out.println("0 - выйти");
        System.out.println("1 - выдать купюры");
        return scanner.nextInt();
    }

    private static void takeMoney(int money) {
        BillAcceptor bill5000 = new BillAcceptor5000();
        BillAcceptor bill2000 = new BillAcceptor2000();
        BillAcceptor bill1000 = new BillAcceptor1000();
        BillAcceptor bill500 = new BillAcceptor500();
        BillAcceptor bill200 = new BillAcceptor200();
        BillAcceptor bill100 = new BillAcceptor100();

        bill5000.setNext(bill2000);
        bill2000.setNext(bill1000);
        bill1000.setNext(bill500);
        bill500.setNext(bill200);
        bill200.setNext(bill100);

        bill5000.takeMoney(new Money(money));
    }
}
