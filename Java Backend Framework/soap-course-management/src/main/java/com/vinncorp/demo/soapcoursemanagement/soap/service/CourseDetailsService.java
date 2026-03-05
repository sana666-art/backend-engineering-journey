package com.vinncorp.demo.soapcoursemanagement.soap.service;

import com.vinncorp.demo.soapcoursemanagement.soap.bean.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class CourseDetailsService {

    public enum Status {
        SUCCESS, FAILURE;
    }
    private static List<Course> courses = new ArrayList<>();

    static {
        Course course1 = new Course(1, "Java", "fundamental Course: 5 Sections");
        courses.add(course1);

        Course course2 = new Course(2, "Spring", "10 Steps");
        courses.add(course2);

        Course course3 = new Course(3, "Spring Boot", "15 Steps");
        courses.add(course3);

        Course course4 = new Course(4, "Spring Maven", "A Build Automation Tool for Spring Boot Framework");
        courses.add(course4);

        Course course5 = new Course(5, "Spring Gradle", "Combo of Maven and Ant tools");
        courses.add(course5);
    }

    public Course findCourseById(int courseId) {
        for (Course course : courses) {
            if (course.getId() == courseId) {
                return course;
            }
        }
        return null;
    }

    public List<Course> findAllCourses() {
        return courses;
    }

    public Status deleteCourseById(int courseId) {

        Iterator<Course> iterator = courses.iterator();

        while (iterator.hasNext()) {
            Course course = iterator.next();
            if (course.getId() == courseId) {
                iterator.remove();
                return Status.SUCCESS;
            }
        }
        return Status.FAILURE;
    }

//    public void updateCourse(Course course) {
//        Iterator<Course> iterator = courses.iterator();
//        while (iterator.hasNext()) {
//            Course course1 = iterator.next();
//            if (course1.getId() == course.getId()) {
//
//            }
//        }
//    }
}
