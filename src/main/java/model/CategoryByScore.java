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
		int positives = 0;
		int negatives = 0;
		int neutrals = 0;
		for (int i = 0; i < comments.size(); i++) {
			Vote vote = comments.get(i).getVote();
			switch (vote){
				case POSITIVE:
					positives++;
				case NEGATIVE:
					negatives++;
				case NEUTRAL:
					neutrals++;
			
			}
		
		}

	}
}
