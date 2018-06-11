package model;

import java.util.List;

public class Visitor extends UserType{
	
	@Override
	public void rank(List<Comment> commentsOfDishs, List<Comment> commentsOfRestaurants, User user) {
		if ((commentsOfDishs.size() + commentsOfRestaurants.size()) > 19) {
			user.setUserType(new Commensal());
		}	
	}
}
