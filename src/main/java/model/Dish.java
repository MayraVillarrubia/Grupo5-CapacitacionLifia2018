package model;

import java.util.List;
import java.util.ArrayList;

public class Dish implements Commentable{
	private String name;
	private Menu menu;
	private Restaurant resto;
	private List<Comment> comments;
	
	public Dish(String name, Menu menu, Restaurant resto){
		this.setName(name);
		this.setMenu(menu);
		this.setRestaurant(resto);
		this.comments = new ArrayList<Comment>();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	public Restaurant getRestaurant(){
		return resto;
	}
	
	public void setRestaurant(Restaurant resto) {
		this.resto = resto;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	public void addComment(Comment aComment) {
		this.getComments().add(aComment);
		
	}

}
