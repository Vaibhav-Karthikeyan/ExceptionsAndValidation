package com.masai.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.entity.Post;
import com.masai.app.service.PostService;

import jakarta.validation.Valid;

@RestController
@RequestMapping
public class PostController {
	@Autowired
	PostService ps;

	@GetMapping("/post")
	public ResponseEntity<?> allPost() {
		List<Post> posts = ps.allPost();
		return new ResponseEntity<List<Post>>(posts, HttpStatus.ACCEPTED);
	}

	@PostMapping("/post")
	public ResponseEntity<?> newPost(@Valid @RequestBody Post post) {
		ps.addPost(post);
		return new ResponseEntity<Post>(post, HttpStatus.ACCEPTED);
	}
}
