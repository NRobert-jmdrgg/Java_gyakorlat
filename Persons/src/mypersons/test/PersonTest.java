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
		
		if (age < 18) {
			String school;
			System.out.println("Iskola: ");
			school = scan.nextLine();
			return new Kid(name, age, school);
		} else {
			String workplc;
			System.out.println("MunkaHely: ");
			workplc = scan.nextLine();
			return new Adult(name, age, workplc);
		}
	}
	
	public static void main(String[] args) {
		Person p1 = readPerson();
		Person p2 = readPerson();
		
		System.out.println(p1 instanceof Kid);
		System.out.println(p2 instanceof Adult);
		
		
	}

}
