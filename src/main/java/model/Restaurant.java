package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Restaurant implements Commentable {
	private String name;
	private TemporalCategory temporalCategory;
	private CategoryByScore categoryByScore;
	private Responsible responsible;
	private Date dateCreation; //fecha de ingreso al sistema
	private List<Comment> comments;
	private List<Dish> dishs;
	private List<Menu> menus;
	private Location location;
	
	
	public Restaurant (String name, Responsible responsible){
		
		this.setName(name);
		//this.setTemporalCategory(TemporalCategory.IN_OPENING);
		this.setCategoryByScore(CategoryByScore.REGULAR); 
		this.setResponsible(responsible);
		this.setDateCreation(new Date());
		this.setComments(new ArrayList<Comment>());
		this.setDishs(new ArrayList<Dish>());
		this.setMenus(new ArrayList<Menu>());
	}
	
	
	public Date getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
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
	
	public void recalculateCategoryByScore() {
		
		//los extremos no se pueden alcanzar si el restaurante está en el sistema hace menos de un año
		
		//newScore = recorro la lista de comentarios (tengo que considerar los comentarios de los platos?) y hago el promedio con los score
		//newCategory = armar relacion entre el puntaje obtenido y la categoria
		//this.setCategoryByScore(categoryByScore);
	}

}
