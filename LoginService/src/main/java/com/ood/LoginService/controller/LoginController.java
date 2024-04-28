package com.ood.LoginService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ood.LoginService.entitiy.UserLogin;
import com.ood.LoginService.service.UserLoginService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/loginservice/api/v1")
public class LoginController {
	
	@Autowired
	UserLoginService userLoginService;
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody UserLogin userlogin){
		System.out.println(userlogin);
		int loginResult = userLoginService.authenticateUser(userlogin);
		return new ResponseEntity<>(loginResult, HttpStatus.OK);
	}

}
