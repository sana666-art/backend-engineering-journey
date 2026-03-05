package com.vinncorp.learnjpaandhibernate.course.jdbc;

import com.vinncorp.learnjpaandhibernate.course.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vinncorp.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.vinncorp.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1, "Learn AWS Jdbc!", "in28minutes"));
//        repository.insert(new Course(2, "Learn Azure Jdbc!", "in28minutes"));
//        repository.insert(new Course(3, "Learn DevOps Jdbc!", "in28minutes"));

//        repository.insert(new Course(1, "Learn AWS Jpa!", "in28minutes"));
//        repository.insert(new Course(2, "Learn Azure Jpa!", "in28minutes"));
//        repository.insert(new Course(3, "Learn DevOps Jpa!", "in28minutes"));

        repository.save(new Course(1, "Learn AWS Jpa!", "in28minutes"));
        repository.save(new Course(2, "Learn Azure Jpa!", "in28minutes"));
        repository.save(new Course(3, "Learn DevOps Jpa!", "in28minutes"));

//        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        //Spring Data JPA Repository
        //builtin methods
        System.out.println(repository.findAll());
        System.out.println(repository.count());

        //Custom methods
        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("Learn AWS Jpa!"));
        System.out.println(repository.findByName("Learn DevOps Jpa!"));


    }

}
