package javabasics;

public class ReverseString {

	public static void main(String[] args) {
		String str = "PTC Interview";
		String rev = "";
		
		for(int i = str.length() - 1; i>=0; i--) {
			rev += str.charAt(i);
		}
		
		System.out.println("Reversed String: " + rev);

	}

}
