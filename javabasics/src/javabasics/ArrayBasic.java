package javabasics;

public class ArrayBasic {

	public static void main(String[] args) {
		int n[] = new int[4];
		n[0]=60;
		n[1]=70;
		n[2]=80;
		n[3]=90;
		
		System.out.println("Student Marks : ");
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i] + " ");
		}
	}

}
