
public class Main {

	public static void main(String[] args) {
		
		String isbn = "0716703440";
		int sum = 0;
		if(isbn.length() == 10) {
			int position = 10;
			for(int i = 0; i < 10; i++) {
				sum = sum + (Integer.parseInt(String.valueOf(isbn.charAt(i))) * position);
				position--;
			}
		}
		
		if(sum % 11 == 0) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
		
		
		

	}

}
