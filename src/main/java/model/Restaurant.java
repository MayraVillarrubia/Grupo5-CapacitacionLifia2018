package model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Commentable {
	private String name;
	private TemporalCategory temporalCategory; //y Category, jerarquia?
	private CategoryByScore categoryByScore;
	private Responsible responsible;
	private List<Comment> comments;
	private List<Dish> dishs;
	private List<Menu> menus;
	private Location location;
	
	
	public Restaurant (String name, Responsible responsible){
		
		this.setName(name);
		//this.setTemporalCategory(new InitialCategory());
		//this.setCategoryByScore(null); //no tiene puntajes al momento de la creacion 
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
	
	public TemporalCategory getTemporalCategory() {
		return temporalCategory;
	}


	public void setTemporalCategory(TemporalCategory temporalCategory) {
		this.temporalCategory = temporalCategory;
	}


	public CategoryByScore getCategoryByScore() {
		return categoryByScore;
	}


	public void setCategoryByScore(CategoryByScore categoryByScore) {
		this.categoryByScore = categoryByScore;
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
