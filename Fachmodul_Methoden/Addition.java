package Fachmodul_Methoden;

import java.util.Scanner;

public class Addition {

    static Scanner sc = new Scanner(System.in);

    public static void main(String [] args){
        double zahl1 = 0.0, zahl2 = 0.0, erg = 0.0;

        //1.Programmhinweis
        programmhinweis(); 
        
        //4.Eingabe
        zahl1 = eingabe("1"); 
        zahl2 = eingabe("2"); 

        //3.Verarbeitung
        erg = verarbeitung(zahl1, zahl2); 

        //2.Ausgabe
        ausgabe(zahl1, zahl2, erg); 
    }

    public static void programmhinweis(){ 
        System.out.println("Hinweis: ");
        System.out.println("Das Programm addiert 2 eingegebene Zahlen. ");
    }

    public static double eingabe(String nbr){ 
        System.out.print(nbr + ". Zahl: ");
        double zahl = sc.nextDouble();
        return zahl;
    }

    public static double verarbeitung(double zahl1, double zahl2){ 
        return zahl1 + zahl2;
    }

    public static void ausgabe(double zahl1, double zahl2, double erg){ 
        System.out.println("Ergebnis der Addition");
        System.out.printf("%.2f = %.2f+%.2f", erg, zahl1, zahl2);
    }
    
}
