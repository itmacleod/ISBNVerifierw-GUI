
public class Verifier {
	
	private String isbn;
	
	/**
	 * method that checks to see if an isbn number is valid or not
	 * @param isbn The isbn number to be checked
	 * @return true if valid, otherwise return false
	 */
	public boolean verify(String isbn) {
		boolean answer;
		int sum = 0;
		if(isbn.length() == 10) {
			int position = 10;
			for(int i = 0; i < 10; i++) {
				sum = sum + (Integer.parseInt(String.valueOf(isbn.charAt(i))) * position);
				position--;
			}
			
			if(sum % 11 == 0) {
				answer = true;
			}else {
				answer = false;
			}
		}else if(isbn.length() == 13) {
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
				answer = true;
			}else {
				answer = false;
			}
		}else {
			return false;
		}
		
		return answer;
		
		
	}

}
