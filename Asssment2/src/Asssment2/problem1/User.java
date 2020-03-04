package Asssment2.problem1;

public class User {

	
	private String name;
	private String emailId;
	private String password;
	private int age;
	
	
	public User(String name, String emailId, String password, int age) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", emailId=" + emailId + ", password=" + password + ", age=" + age + "]";
	}
	
}
