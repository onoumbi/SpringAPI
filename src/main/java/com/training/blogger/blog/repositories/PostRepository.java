package com.training.blogger.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.blogger.blog.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
