package Asssment2.problem1;

import java.util.Scanner;

public class ApplicationMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Email Id");
		String email=sc.next();
		System.out.println("Enter Password");
		String pswd=sc.next();
		User user =new User("Saurabh",email,pswd,21);
		BusinessLayer bl=new BusinessLayer();
		bl.validate(user);
	}

}
