package kalk;

import java.util.Scanner;

public class Kalkulator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sor = input.nextLine();
        input.close();
        String[] elemek = sor.split(" ");
        if(elemek.length != 3) {
            System.out.println("Hibas szerkezet!");
            return;
        }
        int operandus1;
        char operator;
        int operandus2;
        try {
            operandus1 = Integer.parseInt(elemek[0]);
            operandus2 = Integer.parseInt(elemek[2]);
        } catch(NumberFormatException e) {
            System.out.println("Hibas egesz szam");
            return;
        }
        if(elemek[1].length() != 1) {
            System.out.println("Nem megfelelo operator!");
            return;
        } 
        operator = elemek[1].charAt(0);
        double eredmeny;
        switch(operator) {
            case '+':
                eredmeny = operandus1 + operandus2;
                break;
            case '-':
                eredmeny = operandus1 - operandus2;
                break;
            case '*':
                eredmeny = operandus1 * operandus2;
                break;
            case '/':
                if(operandus2 == 0) {
                    System.out.println("Nem lehet 0 val osztani");
                    return ;
                } 
                eredmeny = (double)operandus1 / operandus2;
                break;
            default :
                System.out.println("Nincs ilyen operator");
                return;
        }

        System.out.println("eredmeny: " + eredmeny);
    }
}
