package com.company;

public class Main {

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(31, 12, 15);
        bankomat.currentMoney = 20 * bankomat.count20 + 50 * bankomat.count50 + bankomat.count100 * 100;
        // bankomat.newBankomat();
        //bankomat.KolvoKypur();
        //bankomat.withDrowMoney();


    }


}
