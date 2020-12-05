import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
	
		System.out.println("Welcome to the ISBN verifier");
		System.out.println("Please enter an ISBN number to be checked: ");
		
		String isbn = stdin.next();
		Verifier verifier = new Verifier();
		boolean isValid = verifier.verify(isbn);
		
		if(isValid == true) {
			System.out.println(isbn + " is a valid isbn number!");
		}else {
			System.out.println(isbn + " is not a valid isbn number!");
		}
		
	}

}
