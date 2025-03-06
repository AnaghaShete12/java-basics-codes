package javabasics;

public class MinNum {

	public static void main(String[] args) {
		int[] num = {10, 23, 67, 8};
		int min = num[0];
		
        for(int i=0; i<num.length; i++) {
        	if(num[i] < min) {
        		min = num[i];
        	}
        }
        System.out.println("Maximum Value : " + min);
	}

}