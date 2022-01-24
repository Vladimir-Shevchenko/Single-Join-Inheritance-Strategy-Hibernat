package com.example.homework12;




import com.example.homework12.single.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class BillingRepositorySingleTest {

    private BillingRepository billingRepository = new BillingRepository();

    @Test
    public void should_create_new_user() {

        System.out.println("TEST BILLING-----------------------------------------------"  + billingRepository);
        BankAccount bank = new BankAccount("VIPtest", "PBtest");
        BillingDetails billingDetails = new BillingDetails("boba");
        CreditCard card = new CreditCard(33,"March","2024");
        List<BillingDetails> list = new ArrayList<>();
        list.add(card);
        list.add(bank);
        Buyer buyer = new Buyer("z","u", list);
        buyer.setBillingDetails(list);
        billingRepository.saveB(buyer);

    List<BillingDetails> billingDetailsList =    billingRepository.getAllBillingDetails();

        assertThat(billingDetailsList).isNotNull();

    }

}