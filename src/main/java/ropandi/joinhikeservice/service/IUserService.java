package ropandi.joinhikeservice.service;

import ropandi.joinhikeservice.model.UserLogin;

public interface IUserService {

	int signUp(UserLogin user);
	int checkEmail(String email);
}
