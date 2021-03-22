package szavak;

import java.util.Scanner;
import java.util.ArrayList;
public class Szobeolvas {
    static Scanner megnyitInput() {
        return new Scanner(System.in);
    }
    static String sorBeolvas(Scanner in) {
        return in.nextLine();
    }

    static ArrayList<String> szavakatEltarol(Scanner in) {
        ArrayList<String> szavak = new ArrayList<>();
        String szo;
        //A végére eltárol egy " "-t is
        do {
            szo = sorBeolvas(in);
            szavak.add(szo);    
        } while(!szo.isEmpty());
        
        return szavak;
    }

    static void kiir(ArrayList<String> arr) {
        for(String s : arr) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner input = megnyitInput();
        ArrayList<String> szavak = szavakatEltarol(input);
        kiir(szavak);
    }
}
