package model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	
	private String name;
	private List<Dish> dishs;
	
	public Menu(String name) {
		this.name = name;
		this.dishs = new ArrayList<Dish>();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Dish> getDishs() {
		return dishs;
	}

	public void setDishs(List<Dish> dishs) {
		this.dishs = dishs;
	}
	
	public void addDish(Dish aDish) {
		this.getDishs().add(aDish);
	} 
	
	public void removeDish(Dish aDish) {
		this.getDishs().remove(aDish);
		
	}

}
