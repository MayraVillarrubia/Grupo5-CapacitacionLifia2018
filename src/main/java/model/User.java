package model;

import java.util.List;

public abstract class User {
	
	private String username; 
	private String email;
	private String password;
	public String getUsername() {
		return username;
	}



	public String getEmail() {
		return email;
	}



	public String getPassword() {
		return password;
	}



	public List<Comment> getComments() {
		return comments;
	}



	public UserType getUserType() {
		return userType;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}



	public void setUserType(UserType userType) {
		this.userType = userType;
	}



	private List<Comment> comments;
	private UserType userType;



public abstract void addComment();

}