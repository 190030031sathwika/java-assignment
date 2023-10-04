package assignment6;

public class UserType {
	
	String name;
	
	UserType(){
		this("Student");
	}
	UserType(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {
		UserType usr1 = new UserType("Faculty");
		UserType usr2 = new UserType();
		
		System.out.println(usr1.name);
		System.out.println(usr2.name);

	}

}
