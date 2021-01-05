package Fachmodul_Datentypen.Lernaufgaben_Datentypen_Variablen_Operatoren_plusplus;

import java.util.Scanner;

public class Aufgabe_1 {
    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    double einzelleistung;
    double gesamtleistung;
    double gesamtstromstaerke;
    final double netzspannung = 230.0;
    final double maxStromstaerke = 16.0;
    int anzahlPCs;
    int anzahlStromkreise;
    System.out.print("\nLeistung eines PC-Arbeitsplatzes [in Watt]: ");
    einzelleistung = myScanner.nextDouble();
    System.out.print("Anzahl der PC-Arbeitsplätze: ");
    anzahlPCs = myScanner.nextInt();
    // Berechnung der erforderlichen Stromstärke und der
    // Anzahl der benötigten Stromkreise:

    gesamtleistung = anzahlPCs * einzelleistung;
    gesamtstromstaerke = gesamtleistung / netzspannung;
    anzahlStromkreise = (int)Math.ceil(gesamtstromstaerke / maxStromstaerke);

    System.out.println("Gesamtleistung: " + gesamtleistung);
    System.out.println("Gesamtstromstärke: " + gesamtstromstaerke);
    System.out.println("Anzahl der Stromkreise: " + anzahlStromkreise);
    }
}
