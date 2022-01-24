package com.example.homework12.single;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "buyer")
public class Buyer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String firstName;
    String flastName;

    @OneToMany
    List<BillingDetails> billingDetails;

    public Buyer() {
    }

    public Buyer(String firstName, String flastName , List<BillingDetails> billingDetails) {
        this.firstName = firstName;
        this.flastName = flastName;
        this.billingDetails = billingDetails;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFlastName() {
        return flastName;
    }

    public void setFlastName(String flastName) {
        this.flastName = flastName;
    }

    public List<BillingDetails> getBillingDetails() {
        return billingDetails;
    }

    public void setBillingDetails(List<BillingDetails> billingDetails) {
        this.billingDetails = billingDetails;
    }
}
