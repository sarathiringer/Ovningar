
import java.util.Scanner;

public class Ovn1_11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int age;
		
		System.out.print("Skriv in din �lder:");
		age = scan.nextInt();
		
		final int pension = 65;
		int yearsLeft = pension - age;
		
		System.out.println();
		System.out.println("Du g�r i pension om: " + yearsLeft + " �r");
		
		scan.close();

	}

}
