package assignment8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	
		Student8 s = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Residential Status(HostelLite or DayScholar): ");
		String residentialStatus = sc.nextLine();
		
		
		if(residentialStatus.equalsIgnoreCase("hostellite")) {
			s = new HostelLite(1, 'A', "Aitha", 3000);
			s.displayStudentDetails();
		} else if(residentialStatus.equalsIgnoreCase("dayscholar")) {
			s = new DayScholar(1, 'A', "Sathwika", 0);
			s.displayStudentDetails();
		} else {
			System.out.println("Invalid Input");
		}
		System.out.println(s.calculateFess(100.0));
		
	}
}
