package kalk;

import java.util.Scanner;
import java.util.Arrays;

public class Kalkulator {
    static String[] beker() {
        Scanner s = new Scanner(System.in);
        String input;
        String[] elemek = new String[3]; //binaris muvelet
        char[] ops = {'+', '-', '*', '/', '%'};
        
        boolean ok;
        do {
            ok = true;
            input = s.nextLine();
            elemek = input.split(" ");
            if(elemek.length != 3) {
                System.out.println("Hibas szerkezet!");
                ok = false;
            }
            if(elemek[1].length() != 1) {
                System.out.println("Nem megengedett muvelet");
                ok = false;
            }
            if(!ops.toString().contains(elemek[1])) {
                ok = false;
            }
        } while(!ok);
        s.close();
        return elemek;
    }

    static double szamologep(String[] muvelet) {

    }
    public static void main(String[] args) {
        String[] elemek = beker();
        
    }


}
