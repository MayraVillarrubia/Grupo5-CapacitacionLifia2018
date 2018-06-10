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
	
	public Restaurant(String name, Responsible responsible) {
		this.name = name;
		this.responsible = responsible;
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


	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}


	public Restaurant (String name, Category category, Responsible responsible){
		
		this.setName(name);
		this.setCategory(category);
		this.setResponsible(responsible);
		this.comments = new ArrayList<Comment>();
	}
	
	
	        /* Getters*/
	public String getName() {
		return this.name;
	}
	
	public Category getCategory() {
		return this.category;
	}
	
	public Responsible getResponsible() {
		return this.responsible;
	}
	
	public List<Comment> getComments() {
		return this.comments;
	}
	      /* Setters */
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public void setResponsible(Responsible responsible) {
		this.responsible = responsible;
	}
	
	/* ************ */
	
	public List<Comment> addComment(Comment aComment) {
		this.getComments().add(aComment);
		return this.getComments();
		
	}

}
