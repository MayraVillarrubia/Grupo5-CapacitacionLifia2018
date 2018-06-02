package model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	private String name;
	private Category category;
	private List<Comment> comments;
	private Responsible responsible;
	//private  Ubicacion -> de qué forma la representamos??
	
	
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
