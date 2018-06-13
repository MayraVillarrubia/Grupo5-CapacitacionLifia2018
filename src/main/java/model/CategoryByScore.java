package model;

import java.util.List;
import java.util.ArrayList;

public class CategoryByScore {
	
	public CategoryByScore() {
		
	}
	
	public void recalculateCategoryByScore(List<Comment> comments, Restaurant resto) {
		
		//los extremos no se pueden alcanzar si el restaurante está en el sistema hace menos de un año
		
		//newScore = recorro la lista de comentarios (tengo que considerar los comentarios de los platos?) y hago el promedio con los score
		//newCategory = armar relacion entre el puntaje obtenido y la categoria
		//resto.setCategoryByScore(categoryByScore);
	}

}
