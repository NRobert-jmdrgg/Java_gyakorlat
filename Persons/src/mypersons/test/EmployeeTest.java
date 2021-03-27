package mypersons.test;

import java.util.Scanner;

import mypersons.*;

public class EmployeeTest {

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
			if (!workplc.isEmpty()) {
				System.out.println("Fizetes: ");
				int salary;
				salary = scan.nextInt();
				scan.nextLine();
				return new Employee(name, age, workplc, salary);
			}
			return new Adult(name, age, workplc);
		}
	}
	
	private static int readInt() {
		int a;
		do {
			while (!scan.hasNextInt()) {
				System.out.println("nem szam");
				scan.next();
			}
			a = scan.nextInt();
			scan.nextLine();
		} while (a < 1 || a > 10);
		return a;
	}
	
	public static void main(String[] args) {
		int n = readInt();
		
		Person[] people = new Person[n];
		
		for (int i = 0; i < people.length; i++) {
			people[i] = readPerson();
		}
		
		for (Person person : people) {
			System.out.println(person);
		}
	}

}
