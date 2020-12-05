
public class Main {

	public static void main(String[] args) {
		
		String isbn = "9780716703440";
		int sum = 0;
		if(isbn.length() == 10) {
			int position = 10;
			for(int i = 0; i < 10; i++) {
				sum = sum + (Integer.parseInt(String.valueOf(isbn.charAt(i))) * position);
				position--;
			}
			
			if(sum % 11 == 0) {
				System.out.println("valid");
			}else {
				System.out.println("invalid");
			}
		}
		
		if(isbn.length() == 13) {
			//int position = 13;
			int index = 1;
			for(int i = 0; i < 13; i++) {
				if(index % 2 == 0) {
					sum = sum + (Integer.parseInt(String.valueOf(isbn.charAt(i))) * 3);
				}else {
					sum = sum + (Integer.parseInt(String.valueOf(isbn.charAt(i))) * 1);
				}
				index++;
				
			}
			
			if(sum % 10 == 0) {
				System.out.println("valid");
			}else {
				System.out.println("invalid");
			}
		}
		
		
		
		
		

	}

}
