package com.faith.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.model.Login;
import com.faith.app.service.ILoginService;
import com.faith.app.service.SequenceGeneratorService;

@RestController
@RequestMapping("/")
public class LoginController {

	@Autowired
	ILoginService loginService;
	
	

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ResponseEntity<Login> addResource(@RequestBody Login login) {

		
		return new ResponseEntity<Login>(loginService.addLogin(login), HttpStatus.OK);

	}

	// List user by name and password
	@RequestMapping(value = "login/{username}&{password}", method = RequestMethod.GET)

	public ResponseEntity<Login> listUser(@PathVariable("username") String username,
			@PathVariable("password") String password) {
		ResponseEntity<Login> response = null;

		Login user = (Login) loginService.viewLogin(username, password);
		if (user == null) {
			response = new ResponseEntity<Login>(HttpStatus.NOT_FOUND);
		} else
			response = new ResponseEntity<Login>(user, HttpStatus.OK);
		return response;
	}

	
	@RequestMapping(value="logins",method = RequestMethod.GET)
	public List<Login> listAllLogin() {
	 return loginService.listLogin();
	}

	
	
}
