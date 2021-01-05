package Fachmodul_Datentypen;

/** Variablen.java
    Ergaenzen Sie nach jedem Kommentar jeweils den Quellcode.
    @author Julian Weber
    @version 1.0 from 05.01.2021
  * 
*/
public class Variablen {
  public static void main(String [] args){
    /* 1. Ein Zaehler soll die Programmdurchlaeufe zaehlen.
          Vereinbaren Sie eine geeignete Variable */
          int counter;

    /* 2. Weisen Sie dem Zaehler den Wert 25 zu
          und geben Sie ihn auf dem Bildschirm aus.*/
          counter = 25;
          System.out.println(counter);

    /* 3. Durch die Eingabe eines Buchstabens soll der Menuepunkt
          eines Programms ausgewaehlt werden.
          Vereinbaren Sie eine geeignete Variable */
          char select;

    /* 4. Weisen Sie dem Buchstaben den Wert 'C' zu
          und geben Sie ihn auf dem Bildschirm aus.*/
          select = 'C';
          System.out.println(select);

    /* 5. Fuer eine genaue astronomische Berechnung sind grosse Zahlenwerte
          notwendig.
          Vereinbaren Sie eine geeignete Variable */
          int astro;

    /* 6. Weisen Sie der Zahl den Wert der Lichtgeschwindigkeit zu
          und geben Sie sie auf dem Bildschirm aus.*/
          astro = 299792;
          System.out.println(astro);


    /* 7. Sieben Personen gruenden einen Verein. Fuer eine Vereinsverwaltung
          soll die Anzahl der Mitglieder erfasst werden.
          Vereinbaren Sie eine geeignete Variable und initialisieren sie
          diese sinnvoll.*/
          short members = 7;

    /* 8. Geben Sie die Anzahl der Mitglieder auf dem Bildschirm aus.*/
          System.out.println(members);

    /* 9. Fuer eine Berechnung wird die elektrische Elementarladung benoetigt.
          Vereinbaren Sie eine geeignete Variable und geben Sie sie auf
          dem Bildschirm aus.*/
          final double elementarladung = 1.602E-19;
          System.out.println(elementarladung);

    /*10. Ein Buchhaltungsprogramm soll festhalten, ob eine Zahlung erfolgt ist.
          Vereinbaren Sie eine geeignete Variable. */
          boolean transactiondone;

    /*11. Die Zahlung ist erfolgt.
          Weisen Sie der Variable den entsprechenden Wert zu
          und geben Sie die Variable auf dem Bildschirm aus.*/
          transactiondone = true;
          System.out.println(transactiondone);

  }//main
}// Variablen