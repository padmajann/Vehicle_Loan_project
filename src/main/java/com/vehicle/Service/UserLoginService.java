package com.vehicle.Service;

import com.vehicle.pojo.UserLogin;

public interface UserLoginService {

	UserLogin findByEmailId(String tempEmail);

	UserLogin saveUser(UserLogin user);

}
