package Asssment2.problem1;

import java.util.List;
import java.util.Map;

public class DaoLayer {
	
	Map<String , String> db= Database.getUsers();

	
	
	public void checkDb(User user){
		System.out.println(db);
		db.containsValue(user.getEmailId());
		
	}

}
