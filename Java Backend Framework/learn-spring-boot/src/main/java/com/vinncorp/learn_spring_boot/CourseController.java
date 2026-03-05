package com.vinncorp.learn_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/course")
    public List <Course> reteriveAllCourses() {

        return Arrays.asList(
                new Course(1, "Learn AWS", "Google"),
                new Course(2, "Data Science", "Udemy"),
                new Course(3, "DevOps", "Google")
        );
    }
}
