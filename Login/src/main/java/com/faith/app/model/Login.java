package com.faith.app.model;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Login")
public class Login {

	
	@Id
	private Integer logId;
	
	private String username,password;
	private Integer roleId;
	public Integer getLogId() {
		return logId;
	}
	public void setLogId(Integer logId) {
		this.logId = logId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
}
