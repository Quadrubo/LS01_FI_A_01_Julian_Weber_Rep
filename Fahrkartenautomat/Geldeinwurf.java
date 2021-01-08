package Fahrkartenautomat;

import java.util.Scanner;

public class Geldeinwurf {
	public static double fahrkartenBezahlen(double zuZahlen) {
		Scanner scanner = new Scanner(System.in);
		double eingezahlterGesamtbetrag = 0.0;
		double zuZahlenderBetrag = zuZahlen;
	       while(eingezahlterGesamtbetrag < zuZahlenderBetrag)
	       {
	    	   System.out.printf("Noch zu zahlen: %.2f Euro\n", zuZahlenderBetrag - eingezahlterGesamtbetrag);
	    	   System.out.print("Eingabe (mind. 5Ct, hoechstens 2 Euro): ");
	    	   double eingeworfeneMuenze = scanner.nextDouble();
	           eingezahlterGesamtbetrag += eingeworfeneMuenze;
		   }
		scanner.close();
	    return eingezahlterGesamtbetrag;
	}
}
