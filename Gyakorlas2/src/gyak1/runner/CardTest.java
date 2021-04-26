package gyak1.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import gyak1.Card;
import gyak1.Card.Bank;
import gyak1.CreditCard;

public class CardTest {

	private static Scanner scan = new Scanner(System.in);
	
	public static int readInt() {
		int n;
		do {
			while (!scan.hasNextInt()) {
				System.err.println("Nem szam");
				scan.next();
			}
			n = scan.nextInt();
		} while (n < 1 || n > 10);
		scan.nextLine();
		return n;
	}
	
	public static void main(String[] args) {
		int n = 4;
		
		CreditCard[] c = {
				new CreditCard("Kiss Tamás", 150000, LocalDate.of(2020, 4, 30), Bank.OTP, 100000),
				new CreditCard("Nagy Levente", 24000, LocalDate.of(2022, 5, 31), Bank.ERSTE),
				new CreditCard("Szabó László", 200000, LocalDate.of(2019, 3, 31), Bank.OTP, 200000),
				new CreditCard("Kovács Edit", 250000 , LocalDate.of(2021, 1, 31), Bank.CIB)
		};
		
		for (CreditCard creditCard : c) {
			if (creditCard.penzfelvet(50000) == true) {
				System.out.println("Sikeres : uj egyenleg = " + creditCard.getEgyenleg() + " Hitelkeret = " + creditCard.getHitelkeret());
			} else {
				System.out.println("Sikertelen : egyenleg = " + creditCard.getEgyenleg());
			}
		}
		
		Arrays.sort(c, Comparator.comparing(CreditCard::getErvenyesseg));
		
		listCard(c);
	}
	
	public static int cibNumber(CreditCard[] c) {
		int count = 0;
		for (CreditCard creditCard : c) 
			if (creditCard.getBank() == Bank.CIB)
				count++;
		return count;
	}
	
	public static void listCard(Card[] c) {
		for (Card card : c) {
			System.out.println(card);
		}
	}
	
	
}
