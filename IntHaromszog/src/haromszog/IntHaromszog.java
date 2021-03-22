package haromszog;

import java.util.Scanner;

public class IntHaromszog {
	public static void main(String[] args) {
        int a = beker();
        szamHaromszog(a);
    }  
    
    private static int beker() {
        Scanner s = new Scanner(System.in);
        int a;
        do {
            System.out.println("Give me a number");
            while(!s.hasNextInt()) {
                System.out.println("Not an integer ");
                s.next();
            }
            a = s.nextInt();
        } while(a < 1 || a > 5);
        s.close();
        return a;
    }

    private static void szamHaromszog(int a) {
        for(int sor = 1; sor <= a; sor++) {
            for(int osz = 1; osz <= sor; osz++) {
                System.out.print(osz + " ");
            }
            System.out.println();
        }
    }
}
