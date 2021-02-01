package com.training.blogger.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.blogger.blog.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	
	

}
