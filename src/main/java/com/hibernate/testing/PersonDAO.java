package com.hibernate.testing;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class PersonDAO {
    private SessionFactory sessionFactory;

    public PersonDAO(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void storePerson(Person person){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(person);
    }
}
