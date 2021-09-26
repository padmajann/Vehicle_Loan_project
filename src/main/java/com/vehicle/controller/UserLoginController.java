package com.vehicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.Service.UserLoginService;
import com.vehicle.pojo.UserLogin;
import com.vehicle.repository.UserLoginRepo;

@RestController
public class UserLoginController {
	
	@Autowired
	UserLoginService uService;
	
	@PostMapping("/register")
	public UserLogin registerUser(@RequestBody UserLogin user) throws Exception
	{
		String tempEmail=user.getEmailId();
		if(tempEmail !=null && !"".equals(tempEmail)) 
		{
			UserLogin u=uService.findByEmailId(tempEmail);
			if(u!=null)
				throw new Exception("User exists with this email id"+tempEmail);
		}
		
		
		return uService.saveUser(user);
	}
	
	

}
