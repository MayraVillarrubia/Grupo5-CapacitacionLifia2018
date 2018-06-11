package model;

import java.util.List;

public class Gourmet extends UserType {

	@Override
	public void rank(List<Comment> commentsOfDishs, List<Comment> commentsOfRestaurants, User user) {
		if ((commentsOfDishs.size() + commentsOfRestaurants.size()) < 41) {
			user.setUserType(new Commensal());
			
		}
		
	}

}
