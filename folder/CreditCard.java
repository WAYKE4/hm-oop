package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CreditCard {
    int checkNumber;
    int currentMoney;

    public CreditCard(int checkNumber, int currentMoney) {
        this.checkNumber = checkNumber;
        this.currentMoney = currentMoney;
    }

    void sumCredit() {
        System.out.println("Vvedite summy dlya popolneniya creditnoi karti");
        System.out.println("Tekyshaya summa - " + currentMoney);
        Scanner scanner = new Scanner(System.in);
        int newMoney = scanner.nextInt();
        if (newMoney > 0) {
            currentMoney = currentMoney + newMoney;
        } else {
            System.out.println("Vvedena ne pravilbnaya summa");
            System.exit(0);
        }
    }

    void minusCredit() {
        System.out.println("Vvedite summy dlya snyatiya s creditnoi karti");
        System.out.println("Tekyshaya summa - " + currentMoney);
        Scanner scanner = new Scanner(System.in);
        int newMoney = scanner.nextInt();
        if (currentMoney > newMoney) {
            currentMoney = currentMoney - newMoney;
        } else {
            System.out.println("Nedostato4no sredstv");
            System.exit(0);
        }
    }

    void creditInfa() {
        System.out.println("N" + checkNumber + "," + currentMoney);
    }
}
