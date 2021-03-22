package bemenet;

import java.util.Scanner;

public class Bemenet {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int test;
        do {
            System.out.println("Numb: ");
            while(!s.hasNextInt()) {
                System.out.println("Not a number!");
                s.next();
            }
            test = s.nextInt();
        } while(test < 1 || test > 10);
        s.close();

	}

}
