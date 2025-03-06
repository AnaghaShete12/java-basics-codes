package javabasics;

public class Person {
	String name;
	int age;
	String city;
	
	public Person(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public void displayPersonInfo(){
		System.out.println("Person Name : " + name);
		System.out.println("Person Age : " + age);
		System.out.println("Person city : " + city);
	}


	public static void main(String[] args) {
		Person myperson = new Person("Anagha", 23, "Pune");
		myperson.displayPersonInfo();
	}
	
}


