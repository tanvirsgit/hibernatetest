package com.hibernate.testing;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.DependsOn;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Repository
public class HibernateDAO implements CourseDAO{

    private SessionFactory sessionFactory;

    public HibernateDAO(LocalSessionFactoryBean sessionFactory){
        this.sessionFactory= sessionFactory.getObject();
    }

    @Override
    @Transactional
    public void store(Course course) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(course);
    }

    @Override
    public void delete(int courseId) {

    }

    @Override
    @Transactional
    public Course findById(int courseId){
        Session session = sessionFactory.getCurrentSession();
        Course course=session.find(Course.class,courseId);
        return course;
    }

    @Override
    public List<Course> findAll() {
        return null;
    }


}
