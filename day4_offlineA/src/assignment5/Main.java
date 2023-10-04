package assignment5;

public class Main {
    public static void main(String[] args) {
        DayScholar dayScholar = new DayScholar(5, 'D',"OOP", 16000,"Manu",1001, "NO 32/3 Vijaywada");

        System.out.println(dayScholar.calculateFees());
        System.out.println(dayScholar.getFees());
    }
}
