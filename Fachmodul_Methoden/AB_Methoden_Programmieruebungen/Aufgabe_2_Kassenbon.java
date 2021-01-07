package Fachmodul_Methoden.AB_Methoden_Programmieruebungen;

import java.util.Scanner;


public class Aufgabe_2_Kassenbon {
    public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		// Benutzereingaben lesen
		String artikel = liesString("was m�chten Sie bestellen?", myScanner);
		int anzahl = liesInt("Geben Sie die Anzahl ein:", myScanner);
		double preis = liesDouble("Geben Sie den Nettopreis ein:", myScanner);
        double mwst = liesDouble("Geben Sie den Mehrwertsteuersatz in Prozent ein:", myScanner);

		// Verarbeiten
		double nettogesamtpreis = berechneGesamtnettopreis(anzahl, preis);
		double bruttogesamtpreis = berechneGesamtbruttopreis(nettogesamtpreis, mwst);

		// Ausgeben
        rechnungausgeben(artikel, anzahl, nettogesamtpreis, bruttogesamtpreis, mwst);

    }
    
    public static String liesString(String text, Scanner myScanner){
        System.out.println(text);
        String string = myScanner.next();
        
        return string;
    }

    public static int liesInt(String text, Scanner myScanner){
        System.out.println(text);
        int zahl = myScanner.nextInt();
        
        return zahl;
    }

    public static double liesDouble(String text, Scanner myScanner){
        System.out.println(text);
        double zahl = myScanner.nextDouble();
        
        return zahl;
    }

    public static double berechneGesamtnettopreis(int anzahl, double nettopreis){
        return anzahl * nettopreis;  
    }

    public static double berechneGesamtbruttopreis(double nettogesamtpreis, double mwst){
        return nettogesamtpreis * (1 + mwst / 100);
    }

    public static void rechnungausgeben(String artikel, int anzahl, double nettogesamtpreis, double bruttogesamtpreis, double mwst){
        System.out.println("\tRechnung");
		System.out.printf("\t\t Netto:  %-20s %6d %10.2f %n", artikel, anzahl, nettogesamtpreis);
		System.out.printf("\t\t Brutto: %-20s %6d %10.2f (%.1f%s)%n", artikel, anzahl, bruttogesamtpreis, mwst, "%");
    }

}
