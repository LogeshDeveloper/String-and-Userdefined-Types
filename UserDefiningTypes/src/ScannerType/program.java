package ScannerType;
import java.util.Scanner;
public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		
		String username = sc.nextLine();
		System.out.println("hi"+username+",Welcome to Fita");

		sc.close();
		

	}

}
