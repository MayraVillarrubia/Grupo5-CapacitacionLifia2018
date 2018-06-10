package model;

import java.util.List;

public class Visitor extends UserType{
	
	@Override
	public void rank( List<Comment> comments, User user) {
		if (comments.size() > 19) {
			user.setUserType(new Commensal());
		}
		
	}

	

}
