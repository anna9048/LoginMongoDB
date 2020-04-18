package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.model.Login;
import com.faith.app.repo.ILoginRepo;

@Service
public class LoginService implements ILoginService {
	
	@Autowired
	private ILoginRepo loginRepo;

	@Override
	public Login addLogin(Login login) {
		// TODO Auto-generated method stub
		return loginRepo.save(login);
	}

	@Override
	public Login viewLogin(String username, String password) {
		// TODO Auto-generated method stub
		return loginRepo.findByUser(username, password);
	}

	@Override
	public List<Login> listLogin() {
		// TODO Auto-generated method stub
		return loginRepo.findAll();
	}

}
