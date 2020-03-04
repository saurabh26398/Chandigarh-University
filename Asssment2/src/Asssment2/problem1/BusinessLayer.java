package Asssment2.problem1;

public class BusinessLayer {
 User user;

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

@Override
public String toString() {
	return "BusinessLayer [user=" + user + "]";
}

public void validate(User user) {
	 String regex = 
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	 try{
	if(!user.getEmailId().equals(null) && user.getPassword().equals(null)){
		if(user.getEmailId().matches(regex) && user.getPassword().length()>=8){
		
			DaoLayer dao=new DaoLayer();
			dao.checkDb(user);
		}
		else{
			
			throw new InvalidDetailException();
		}}}
	catch(InvalidDetailException e){
		System.out.println(e);
	}
		
	}
	
}
 

