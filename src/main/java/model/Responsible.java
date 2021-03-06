package model;

public class Responsible extends User{
	
	private Restaurant restaurant;
	
	public Responsible(String username, String mail, String pass, Location location){ 
		super(username, mail, pass, location);
	}
	
	public Restaurant getRestaurant() {
		return restaurant;
	}


	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	//*****puede ser responsable de más de un restaurant?? PREGUNTAR
	public void addRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	public void removeRestaurant(){
		this.restaurant = null;
	}
	
	@Override
	public void makeACommentOfDish(String description, Dish dish, Vote score) throws DistanceException {
		//calcularDistancia() no está implemmentado
		//if ((calcularDistancia(dish.getRestaurant().getLocation(), this.getRestaurant().getLocation()) > 1000 )) {
			Comment com = new Comment(this, description, dish, score);
			this.addComment(com, this.getCommentsOfDishs());
			dish.addComment(com);
		//}
			//else {
			throw new DistanceException("The distance is less than the allowed");
			//}
				
	}			
		
	@Override
	public void makeACommentOfRestaurant(String description, Restaurant rest, Vote score) throws DistanceException{
		//calcularDistancia() no está implemmentado
		//if ((calcularDistancia(rest.getLocation(), this.getRestaurant().getLocation()) > 1000 )) {
			Comment com = new Comment(this, description, rest, score);
			this.addComment(com, this.getCommentsOfRestaurants());
			rest.addComment(com);
		//}
			//else {
			throw new DistanceException("The distance is less than the allowed");
			//}			
		
	}


	
}
