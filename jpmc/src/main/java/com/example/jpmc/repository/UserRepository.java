package com.example.jpmc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpmc.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	User findByIdAndPassword(int id,String password);


}
