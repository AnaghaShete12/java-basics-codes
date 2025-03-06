package javabasics;
import java.util.*;

public class StringDemo {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter 1st string: ");
	        String A = sc.nextLine();
	        System.out.println("Enter 2nd string: ");
	        String B = sc.nextLine();
	        System.out.println("Enter 3rd string: ");
	        String C = sc.nextLine();

	        int number = Integer.parseInt(A);
	        double num = Double.parseDouble(B);
	        boolean n = Boolean.parseBoolean(C);
	        
	        System.out.println(number);
	        System.out.println(num);
	        System.out.println(n);
	    }
	

}
