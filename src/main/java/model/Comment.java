package model;

public class Comment {
	private User user;
	private String description;
	private Commentable commentable;
	private Integer score; //de 1 a 5
	
	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	
	public Comment(User user, String description, Commentable commentable, Integer score) {
		this.setUser(user);
		this.setDescription(description);
		this.setCommentable(commentable);
		this.setScore(score);
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
