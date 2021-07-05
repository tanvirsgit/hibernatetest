package com.hibernate.testing;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Repository
public class JpaCourseDAO implements CourseDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void store(Course course) {

        entityManager.persist(course);
    }

    @Override
    public void delete(int courseId) {

    }

    @Override
    public Course findById(int courseId) {
        return null;
    }

    @Override
    public List<Course> findAll() {
        return null;
    }

    public void name(){
        System.out.println("This is JpaDao");
    }
}
