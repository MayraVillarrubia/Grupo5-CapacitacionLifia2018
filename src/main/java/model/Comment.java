package model;

public class Comment {
	private User user;
	private String description;
	private Commentable commentable;
	private Vote vote; //enum positive, negative, neutral

	

	public Comment(User user, String description, Commentable commentable, Vote vote) {
		this.setUser(user);
		this.setDescription(description);
		this.setCommentable(commentable);
		this.setVote(vote);
	}
	

	public Vote getVote() {
		return vote;
	}

	public void setVote(Vote vote) {
		this.vote = vote;
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
