package mypersons.test;

import mypersons.*;
import java.util.Scanner;

public class PersonTest {

	private static Scanner scan = new Scanner(System.in);
	
	private static Person readPerson() {
		String name;
		int age;
		System.out.println("Nev:");
		name = scan.nextLine();
		System.out.println("eletkor: ");
		age = scan.nextInt();
		scan.nextLine();
		
		return new Person(name, age);
	}
	
	public static void main(String[] args) {
		Person p1 = readPerson();
		Person p2 = readPerson();
		
	}

}
