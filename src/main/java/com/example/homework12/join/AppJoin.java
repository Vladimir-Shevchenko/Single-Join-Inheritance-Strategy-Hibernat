package com.example.homework12.join;

import java.util.ArrayList;
import java.util.List;

public class AppJoin {
    public static void main(String[] args) {
       BillingRepository studentDao = new BillingRepository();

        BillingDetails billingDetails = new BillingDetails("boba");
       BankAccount bank = new BankAccount("VIP", "PB");
       CreditCard card = new CreditCard(33,"March","2024");


     List<BillingDetails> list = new   ArrayList<>();
     list.add(card);
     list.add(bank);
        Buyer buyer = new Buyer("z","u", list);


        buyer.setBillingDetails(list);

        studentDao.saveB(buyer);

        System.out.println( studentDao.getAllBillingDetails());
    }
}