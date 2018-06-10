package model;

import java.util.ArrayList;
import java.util.List;

public class Ratatoullie {
	private List<Restaurant> restaurants;
	private List<User> users;

	public Ratatoullie(){
		this.restaurants = new ArrayList<Restaurant>();
		this.users = new ArrayList<User>();	
	}

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	//add y remove faltan
}
