package model;

import java.util.List;

public class Commensal extends UserType{

	@Override
	public void rank(List<Comment> commentsOfDishs, List<Comment> commentsOfRestaurants,  User user) {
		Integer total = commentsOfRestaurants.size() + commentsOfDishs.size();
		if ((total) > 40) {
			user.setUserType(new Gourmet());
			
		}
		else {
			if (total < 20) {
				user.setUserType(new Visitor());
			}
		}
		
	}

}
