package ropandi.joinhikeservice.service.impl;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ropandi.joinhikeservice.entity.MUser;
import ropandi.joinhikeservice.model.LoginRequest;
import ropandi.joinhikeservice.model.UserLogin;
import ropandi.joinhikeservice.repository.UserRepository;
import ropandi.joinhikeservice.service.IUserLoginService;

@Service
public class UserLoginService implements IUserLoginService {

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public UserLogin login(LoginRequest loginRequest) {
		// TODO Auto-generated method stub
		UserLogin userLogin = new UserLogin();
		try{Optional<MUser> user = userRepository.findByEmailAndPassword(loginRequest.getUsername(), loginRequest.getPassword());
		if(user.isPresent()) {
			userLogin.setId(user.get().getId());
			userLogin.setName(user.get().getName());
			userLogin.setPhoneNumber(user.get().getPhoneNumber());
			userLogin.setToken("fawydfwwy rguq3glruq3gorqi");
		}
		return userLogin;
		}catch(Exception e) {
		return userLogin;
		}
		
	}

	@Override
	public Map<String, String> saveUser(UserLogin userLogin) {
		// TODO Auto-generated method stub
		return null;
	}

}
