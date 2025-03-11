package Hash;

public class PhoneList {

	   public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        
	        for(String phone : phone_book) {
	        	
	        	if(phone_book.equals(phone)) {
	        		answer = false;
	        	}
	        }
	        
	        
	        return answer;
	    }
	
}
