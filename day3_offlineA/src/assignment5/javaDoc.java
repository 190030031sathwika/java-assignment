package assignment5;

public class javaDoc {

	public static void main(String[] args) {
		String userName = "sathwika";
		System.out.println("Length: "+userName.length());
		System.out.println("Hi "+userName);
		System.out.println(userName.toLowerCase());
		System.out.println(userName.toUpperCase());
		if(userName.startsWith("a"))
			System.out.println("Starts with a");
		else System.out.println("Does not starts with a");
		userName = "SEED";
	}

}
