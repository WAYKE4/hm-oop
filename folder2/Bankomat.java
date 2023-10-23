package com.company;

import java.util.Scanner;

public class Bankomat {
    int num20 = 20;
    int num50 = 50;
    int num100 = 100;
    int count20;
    int count50;
    int count100;
    int currentMoney;

    public Bankomat(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;

    }

    void KolvoKypur() {
        System.out.println("Kolvo 20 - " + count20);
        System.out.println("Kolvo 50 - " + count50);
        System.out.println("Kolvo 100 - " + count100);
    }

    void newBankomat() {
        System.out.println("Tekyshaya summa v bankomate - " + currentMoney);
        System.out.println("Dostypnie nominali dlya popolneniya - 20,50,100");
        System.out.println("Viberite nominal , 1 - 20 ; 2 - 50 ; 3 - 100");
        Scanner scanner = new Scanner(System.in);
        int numKypuri = scanner.nextInt();

        switch (numKypuri) {
            case 1 -> {
                currentMoney = currentMoney + num20;
                count20++;
                System.out.println("Tekyshaya summa v bankomate - " + currentMoney);
                break;
            }
            case 2 -> {
                currentMoney = currentMoney + num50;
                count50++;
                System.out.println("Tekyshaya summa v bankomate - " + currentMoney);
                break;
            }
            case 3 -> {
                currentMoney = currentMoney + num100;
                count100++;
                System.out.println("Tekyshaya summa v bankomate - " + currentMoney);
                break;
            }
            default -> {
                System.out.println("Vveden ne pravil'ni nominal");
                System.exit(0);
            }
        }

    }

    boolean withDrowMoney() {
        System.out.println("Tekyshaya summa v bankomate - " + this.currentMoney);
        System.out.println("Dostypnie nominali dlya snyatiya - 20,50,100");
        System.out.println("Vvedite nyjnyu symmy");
        Scanner scanner = new Scanner(System.in);
        int Sum = scanner.nextInt();

        int required20 = 0;
        int required50 = 0;
        int required100 = 0;

        if (Sum >= 100 && count100 > 0) {
            required100 = Sum / 100;
            if (required100 > count100) {
                required100 = count100;
            }
            Sum -= required100 * 100;
        }

        if (Sum >= 50 && count50 > 0) {
            required50 = Sum / 50;
            if (required50 > count50) {
                required50 = count50;
            }
            Sum -= required50 * 50;
        }

        if (Sum >= 20 && count20 > 0) {
            required20 = Sum / 20;
            if (required20 > count20) {
                required20 = count20;
            }
            Sum -= required20 * 20;
        }

        if (Sum == 0) {
            count20 -= required20;
            count50 -= required50;
            count100 -= required100;
            System.out.println("Operaciya proizvedena yspeshna!");
            System.out.println("Vidano kypur nominalom 20 - " + required20);
            System.out.println("Vidano kypur nominalom 50 - " + required50);
            System.out.println("Vidano kypur nominalom 100 - " + required100);
            return true;
        } else {
            System.out.println("Operaciya ne vipolnena. V bankomate nedosto4no kypur ili summa ne podxodit po nominaly.");
            return false;
        }
    }
}




