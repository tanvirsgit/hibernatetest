package com.hibernate.testing;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String args[]){
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(HIbernateConfig.class);

        //CourseDAO courseDAO = context.getBean(CourseDAO.class);
       // CourseRepo courseRepo = context.getBean(CourseRepo.class);
        PersonDAO personDAO = context.getBean(PersonDAO.class);

        //System.out.println(courseDAO.toString());
        Course course = new Course();
        course.setTitle("Bangla");
        course.setStartDate(new GregorianCalendar(2021,6,4).getTime());
        course.setEndDate(new GregorianCalendar(2021,7,2).getTime());
        course.setFee(1000);

       // courseDAO.store(course);
       // course = courseDAO.findById(12);
        /*System.out.println(course.toString());

        courseRepo.save(course);
        System.out.println(courseRepo.findById(12).toString());

        courseRepo.findAll().forEach(c-> System.out.println(c.getTitle()));*/

        Person person = new Person();
        person.setName("Hero");
        person.setAddress("Antarctica");
        personDAO.storePerson(person);

    }
}
