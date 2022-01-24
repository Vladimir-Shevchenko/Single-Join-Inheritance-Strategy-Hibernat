package com.example.homework12.single;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public class BillingRepository {

    @Transactional
    public  void saveB( Buyer buyer){
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(buyer.getBillingDetails().get(0));
            session.save(buyer.getBillingDetails().get(1));
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }


    //@Transactional
    public List < BillingDetails > getAllBillingDetails() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from BillingDetails", BillingDetails.class).list();
        }
    }
}