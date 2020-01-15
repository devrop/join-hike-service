package ropandi.joinhikeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ropandi.joinhikeservice.model.UserLogin;
import ropandi.joinhikeservice.service.IUserService;
@RestController
@RequestMapping()
public class UserController {

	@Autowired
	private IUserService userService;
	@PostMapping("signup")
	public ResponseEntity<Integer> signUp(@RequestBody UserLogin user){
		int result = userService.signUp(user);
		return new ResponseEntity<Integer>(result,HttpStatus.OK);
	}
	
}
