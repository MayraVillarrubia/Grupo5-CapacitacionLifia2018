package model;

public class Comment {
	private User user;
	private String description;
	private Object relatedWith;
	
	//cómo sabemos si es un comentario hecho a un restaurant o a un plato??
	public Comment(User user, String description, Object object){
		this.user = user;
		this.description = description;
		this.relatedWith = object;	
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Object getRelatedWith() {
		return relatedWith;
	}

	public void setRelatedWith(Object relatedTo) {
		this.relatedWith = relatedTo;
	}

}
