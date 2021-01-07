package Fachmodul_Datentypen.Lernaufgaben_Datentypen_Variablen_Operatoren_plusplus;

import java.util.Scanner;

public class Aufgabe_2_Dual8 {

    static void binToDec(){
        Scanner entry = new Scanner(System.in);

        System.out.print("Bitte gib eine Dualzahl ein: ");
        int binNbr = entry.nextInt();

        entry.close();

        int moveCount = 0;
        int decNbr = 0;
        int remainder = 0;

        while(binNbr != 0){
            remainder = binNbr % 10;
            decNbr = decNbr + (int)(remainder * (Math.pow(2, moveCount)));
            binNbr = binNbr / 10;
            moveCount = moveCount + 1;
        }
        System.out.printf("Hier die Dezimalzahl: %s", decNbr);       
    }


    public static void main(String [] args){
        binToDec();
    }
}
