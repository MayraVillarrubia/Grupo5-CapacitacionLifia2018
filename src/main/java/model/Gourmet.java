package model;

import java.util.List;

public class Gourmet extends UserType {

	@Override
	public void rank(List<Comment> comments, User user) {
		if (comments.size() < 41) {
			user.setUserType(new Commensal());
			
		}
		
	}

}
