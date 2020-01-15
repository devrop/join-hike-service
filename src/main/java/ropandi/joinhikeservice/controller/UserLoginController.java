package ropandi.joinhikeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ropandi.joinhikeservice.model.LoginRequest;
import ropandi.joinhikeservice.model.UserLogin;
import ropandi.joinhikeservice.service.IUserLoginService;

@RestController
@RequestMapping("api")
public class UserLoginController {

	@Autowired
	private IUserLoginService loginService;
	
	@PostMapping("login")
	public ResponseEntity<UserLogin> login(@RequestBody LoginRequest request){
		UserLogin lg = loginService.login(request);
		
		return new ResponseEntity<UserLogin>(lg,HttpStatus.OK);
		
	}
}
