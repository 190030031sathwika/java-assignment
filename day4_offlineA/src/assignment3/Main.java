package assignment3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student3 s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Residential Status(HostelLite or DayScholar): ");
		String residentialStatus = sc.nextLine();
		
		
		if(residentialStatus.equalsIgnoreCase("hostellite")) {
			s = new HostelLite(1, 'a', "sathwika", 3000);
			s.displayStudentDetails();
		} else if(residentialStatus.equalsIgnoreCase("dayscholar")) {
			s = new DayScholar(1, 'a', "aitha", 0);
			s.displayStudentDetails();
		} else {
			System.out.println("Invalid Input");
		}
		
	}
}
