package ropandi.joinhikeservice.service;

import java.util.Map;

import ropandi.joinhikeservice.model.LoginRequest;
import ropandi.joinhikeservice.model.UserLogin;

public interface IUserLoginService {

	UserLogin login(LoginRequest loginRequest);
	
	Map<String,String> saveUser(UserLogin userLogin);
	
	
	
}
