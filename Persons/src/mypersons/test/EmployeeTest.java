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
	
	private static void sortByAge(Person[] a) {
		//beszuro
		int j;
		Person key;
		for (int i = 1; i < a.length; i++) {
			key = a[i];
			j = i - 1;
			while (j >= 0 && a[j].getAge() > key.getAge()) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
	}
	
	public static void main(String[] args) {
		int n = readInt();
		
		Person[] people = new Person[n];
		
		for (int i = 0; i < people.length; i++) {
			people[i] = readPerson();
		}
		
		sortByAge(people);
		
		for (Person person : people) {
			System.out.println(person);
		}
		
		scan.close();
	}

}
