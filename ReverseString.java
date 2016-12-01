package Session4;

import java.lang.String;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String message = "Reversing the String message";
		
		System.out.println("Before reverse :" +message);
		
		String reverse = "";
		int i = 0, length;
		length = message.length();
		for(i = length -1; i > 0; i--)
		reverse = reverse+message.charAt(i);
		System.out.println("After reverse: " +reverse);
		
	}

}
