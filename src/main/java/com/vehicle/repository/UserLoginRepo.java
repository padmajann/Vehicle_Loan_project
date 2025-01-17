package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.pojo.UserLogin;

@Repository
public interface UserLoginRepo extends JpaRepository<UserLogin, Integer>{

	UserLogin findByEmailId(String tempEmail);

}
