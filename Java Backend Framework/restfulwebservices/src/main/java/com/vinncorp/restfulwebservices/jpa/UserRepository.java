package com.vinncorp.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinncorp.restfulwebservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
