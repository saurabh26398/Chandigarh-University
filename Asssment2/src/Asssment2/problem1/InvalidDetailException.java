package Asssment2.problem1;

public class InvalidDetailException extends Exception {
	static String msg="Invalid Details";
	
	public InvalidDetailException(){
		super(msg);
	}

}
