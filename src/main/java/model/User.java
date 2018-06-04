package model;

import java.util.List;

public abstract class User {
	
	private String username;
	private List<Comment> Comments;
	private UserType userType;



public abstract void addComment();

}