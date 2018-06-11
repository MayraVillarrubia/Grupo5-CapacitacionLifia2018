package model;

public class Comment {
	private User user;
	private String description;
	private Commentable commentable;
	
	//cómo sabemos si es un comentario hecho a un restaurant o a un plato??
	public Comment(User user, String description, Commentable commentable) {
		this.user = user;
		this.description = description;
		this.commentable = commentable;
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

	public Commentable getCommentable() {
		return commentable;
	}

	public void setCommentable(Commentable commentable) {
		this.commentable = commentable;
	}

}
