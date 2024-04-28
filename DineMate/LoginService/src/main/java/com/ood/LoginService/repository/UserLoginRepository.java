package com.ood.LoginService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ood.LoginService.entitiy.UserLogin;

@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin, Integer>{
	
	public UserLogin findByUserNameAndPassword(String username, String password);
	
}
