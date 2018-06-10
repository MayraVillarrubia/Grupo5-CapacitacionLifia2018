package model;

import java.util.List;

public class Commensal extends UserType{

	@Override
	public void rank(List<Comment> comments, User user) {
		if (comments.size() > 40) {
			user.setUserType(new Gourmet());
			
		}
		else {
			if (comments.size() < 20) {
				user.setUserType(new Visitor());
			}
		}
		
	}

}
