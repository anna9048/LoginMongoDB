package com.faith.app.service;

import java.util.List;

import com.faith.app.model.Login;

public interface ILoginService {

	public Login addLogin(Login login);
	public Login viewLogin(String username, String password);
	public List<Login>listLogin();
	
}
