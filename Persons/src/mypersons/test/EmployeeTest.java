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
				int salary;
				salary = scan.nextInt();
				scan.nextLine();
				return new Employee(name, age, workplc, salary);
			}
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
