package model;

public class Responsible extends User{
	
	private Restaurant restaurant;
	
	public Responsible(String username, String mail, String pass){ 
		super(username, mail, pass);
	}
	
	//*****puede ser responsable de más de un restaurant?? PREGUNTAR
	public void addRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	public void removeRestaurant(){
		this.restaurant = null;
	}


	public Restaurant getRestaurant() {
		return restaurant;
	}


	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

}
