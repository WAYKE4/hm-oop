package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(72101, 1000);
        CreditCard creditCard2 = new CreditCard(77777, 70000);
        CreditCard creditCard3 = new CreditCard(123, 1230000);
        creditCard1.creditInfa();
        creditCard2.creditInfa();
        creditCard3.creditInfa();

        creditCard1.sumCredit();
        creditCard2.sumCredit();
        creditCard3.minusCredit();

        creditCard1.creditInfa();
        creditCard2.creditInfa();
        creditCard3.creditInfa();
    }

}
