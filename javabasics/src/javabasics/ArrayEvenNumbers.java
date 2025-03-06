package javabasics;

public class ArrayEvenNumbers {

	public static void main(String[] args) {
		int[] array = {12, 10, 13, 23, 20};
		System.out.println("Even Numbers: ");
		for(int i=0; i<array.length; i++) {
			if(array[i]%2==0) {
				System.out.println(array[i] + " ");
			}
		}

	}

}
