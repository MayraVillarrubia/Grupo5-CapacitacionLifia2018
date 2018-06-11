package model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	private String name;
	private Category category; //y Category, jerarquia?
	private Responsible responsible;
	private List<Comment> comments;
	private List<Dish> dishs;
	private List<Menu> menus;
	//private  Ubicacion -> de qué forma la representamos??
	
	
	public Restaurant (String name, Category category, Responsible responsible){
		
		this.setName(name);
		this.setCategory(category);
		this.setResponsible(responsible);
		this.comments = new ArrayList<Comment>();
		this.dishs = new ArrayList<Dish>();
		this.menus = new ArrayList<Menu>();
	}
	
	
	public List<Dish> getDishs() {
		return dishs;
	}


	public void setDishs(List<Dish> dishs) {
		this.dishs = dishs;
	}

	public List<Comment> getComments() {
		return this.comments;
	}
	
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	        /* Getters*/
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Category getCategory() {
		return this.category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Responsible getResponsible() {
		return this.responsible;
	}
	
	public void setResponsible(Responsible responsible) {
		this.responsible = responsible;
	}
	
	public List<Menu> getMenus() {
		return menus;
	}


	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	
	public void addComment(Comment aComment) {
		this.getComments().add(aComment);
	}

}
