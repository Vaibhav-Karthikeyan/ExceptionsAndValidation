package com.masai.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.app.entity.Post;

public interface PostRepository extends JpaRepository<Post,Integer>{

}
