package com.masai.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.entity.Post;
import com.masai.app.repository.PostRepository;

@Service
public class PostService {
	@Autowired
	PostRepository postrep;
	
	public Post addPost(Post post) {
		postrep.save(post);
		return post;
	}
	
	public List<Post> allPost() {
		return postrep.findAll();
	}
}
