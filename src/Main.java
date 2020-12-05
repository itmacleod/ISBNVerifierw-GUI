
public class Main {

	public static void main(String[] args) {
		
		String isbn = "9780716703440";
		
		Verifier verifier = new Verifier();
		boolean isValid = verifier.verify(isbn);
		
		if(isValid == true) {
			System.out.println(isbn + " is a valid isbn number!");
		}else {
			System.out.println(isbn + " is not a valid isbn number!");
		}
		
	}

}
