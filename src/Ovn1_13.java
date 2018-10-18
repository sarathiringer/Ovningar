import java.util.Scanner;

public class Ovn1_13 {

	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		int tal1;
		
		System.out.print("Skriv in ett tal:");
		tal1 = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		int tal2;
		
		System.out.print("Skriv in ytterligare ett tal:");
		tal2 = scan2.nextInt();
		
		System.out.println();
		System.out.println(tal1 + "+" + tal2 + "=" + (tal1 + tal2));
	
		System.out.println(tal1 + "-" + tal2 + "=" + (tal1 - tal2));

		System.out.println(tal1 + "*" + tal2 + "=" + (tal1 * tal2));
		
		System.out.println(tal1 + "/" + tal2 + "=" + ((double)tal1/tal2));
		
		
		scan1.close();
		
		scan2.close();

	}

}