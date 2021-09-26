package com.vehicle.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.pojo.UserLogin;
import com.vehicle.repository.UserLoginRepo;

@Service
public class UserLoginServiceImpl implements UserLoginService{

	@Autowired
	UserLoginRepo uRepo;

	@Override
	public UserLogin findByEmailId(String tempEmail) {
		// TODO Auto-generated method stub
		return uRepo.findByEmailId(tempEmail);
	}

	@Override
	public UserLogin saveUser(UserLogin user) {
		// TODO Auto-generated method stub
		return uRepo.save(user);
	}
}
