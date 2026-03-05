package com.vinncorp.restfulwebservices.jpa;

import com.vinncorp.restfulwebservices.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
