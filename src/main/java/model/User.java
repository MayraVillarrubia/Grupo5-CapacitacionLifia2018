package model;

import java.util.List;
import java.util.ArrayList;

public abstract class User {
	
	private String username; 
	private String email;
	private String password;
	private UserType userType;
	private Location location;
	private List<Comment> commentsOfDishs;
	private List<Comment> commentsOfRestaurants;
	
	
	public User (String username, String mail, String pass, Location location){
		this.setUsername(username);
		this.setEmail(mail);
		this.setPassword(pass);
		this.setUserType(new Visitor()); 
		this.setLocation(location); 
		this.setCommentsOfDishs(new ArrayList<Comment>());
		this.setCommentsOfRestaurants(new ArrayList<Comment>());
		
	}
	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
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
	
	public UserType getUserType() {
		return userType;
	}

	public List<Comment> getCommentsOfDishs() {
		return commentsOfDishs;
	}
	
	public List<Comment> getCommentsOfRestaurants() {
		return commentsOfRestaurants;
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

	public void setCommentsOfDishs(List<Comment> comments) {
		this.commentsOfDishs = comments;
	}
	
	public void setCommentsOfRestaurants(List<Comment> comments) {
		this.commentsOfRestaurants = comments;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}


	public void addComment(Comment aComment, List<Comment> listComments) {
		listComments.add(aComment);
		this.getUserType().rank(this.getCommentsOfDishs(), this.getCommentsOfRestaurants(), this);	
	} 
	
	/*public void addCommentOfRestaurant(Comment aComment) {
		this.getCommentsOfRestaurants().add(aComment);
		this.getUserType().rank(this.getCommentsOfDishs(), this.getCommentsOfRestaurants(), this);
		
	}*/
	
	public void removeComment(Comment aComment, List<Comment> listComments) {
		listComments.remove(aComment);
		this.getUserType().rank(this.getCommentsOfDishs(),this.getCommentsOfRestaurants(), this);
		
	}
	
	public void makeACommentOfDish(String description, Dish dish, Vote vote) throws DistanceException {
		Comment com = new Comment(this, description, dish, vote);
		this.addComment(com, this.getCommentsOfDishs());
		dish.addComment(com);
		
	}
	
	public void makeACommentOfRestaurant(String description, Restaurant resto, Vote vote) throws DistanceException {
		Comment com = new Comment(this, description, resto, vote);
		this.addComment(com, this.getCommentsOfRestaurants());
		resto.addComment(com);
		
	}
	
}