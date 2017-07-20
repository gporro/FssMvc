package it.bata.bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="userMB")
@ApplicationScoped
public class UserManager {

	private String username;
	private String password;
	private String usernameUser = "test";
	private String passwordUser = "test";
	
	
	public UserManager() {
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
	
	public String login(){
		String page ="404";
		if(username.equals(usernameUser) && password.equals(passwordUser)){
			page = "home";
		}
		return page;
	}

}
