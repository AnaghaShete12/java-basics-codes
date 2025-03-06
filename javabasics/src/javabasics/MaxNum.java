package javabasics;

public class MaxNum {

	public static void main(String[] args) {
		int[] num = {10, 23, 67, 8};
		int max = num[0];
		
        for(int i=0; i<num.length; i++) {
        	if(num[i] > max) {
        		max = num[i];
        	}
        }
        System.out.println("Maximum Value : " + max);
	}

}
