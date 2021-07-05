package com.hibernate.testing;

import java.util.List;

public interface CourseDAO {

    void store(Course course);
    void delete(int courseId);
    Course findById(int courseId);
    List<Course> findAll();
}
