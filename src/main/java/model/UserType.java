package model;

import java.util.List;

public abstract class UserType {

	public abstract void rank(List<Comment> commentsOfDishs, List<Comment> commentsOfRestaurants, User user);

}
