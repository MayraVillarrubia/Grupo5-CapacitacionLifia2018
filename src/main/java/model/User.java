package model;

import java.util.List;
import java.util.ArrayList;

public abstract class User {
	
	private String username; 
	private String email;
	private String password;
	private List<Comment> comments;
	private UserType userType;

	
	public User (String username, String mail, String pass){
		this.username = username;
		this.email = mail;
		this.comments = new ArrayList<Comment>();
		this.password = pass;
		this.userType = new Visitor(); 
	}
	
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


	public void addComment(Comment aComment) {
		this.getComments().add(aComment);
		this.getUserType().rank(this.getComments(), this);
		
	} 
	
	public void removeComment(Comment aComment) {
		this.getComments().remove(aComment);
		this.getUserType().rank(this.getComments(), this);
		
	}
	
	

}