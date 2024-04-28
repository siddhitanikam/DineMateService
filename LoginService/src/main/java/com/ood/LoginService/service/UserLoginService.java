package com.ood.LoginService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ood.LoginService.entitiy.UserLogin;
import com.ood.LoginService.repository.UserLoginRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserLoginService {
	
	@Autowired
	private UserLoginRepository userLoginRepository;
	
	public int authenticateUser(UserLogin userLogin) {
		UserLogin userlogin = userLoginRepository.findByUserNameAndPassword(userLogin.getUserName(), userLogin.getPassword());
		return userlogin == null ? -1 : userlogin.getEmpID() ;
	}
	

}
