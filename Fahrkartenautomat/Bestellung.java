package Fahrkartenautomat;

import java.util.Scanner;

public class Bestellung {
	public static double fahrkartenbestellungErfassen() {
		System.out.println("Waehlen Sie ihre Wunschfahrkarte fuer Berlin AB aus: ");
		Scanner scanner = new Scanner(System.in);
		int wahl = 0;
		double einzelpreis = 0;
		double anzahl = 0;
		while(wahl == 0){	
			System.out.println("- Einzelfahrschein Regeltarif AB [2,90 EUR] (1)");
			System.out.println("- Tageskarte Regeltarif AB [8,60 EUR] (2)");
			System.out.println("- Kleingruppen-Tageskarte Regeltarif AB [23,50 EUR] (3)");
			System.out.println("- Bezahlen (9)");
			System.out.print("Ihre Wahl: ");
			wahl = scanner.nextInt();
			if(wahl == 1 || wahl == 2 || wahl == 3){
				System.out.print("Anzahl der Tickets (EURO): ");
				anzahl = scanner.nextDouble();
				while(anzahl < 1 || anzahl > 10) {
					System.out.println("Ey man darf nur zwischen 1 und 10 Tickets kaufen.");
					System.out.print("Anzahl der Tickets (EURO): ");
					anzahl = scanner.nextDouble();
				}
			}	
			if(wahl == 1){
				einzelpreis = einzelpreis + (anzahl * 2.90);
				wahl = 0;
			}else if(wahl == 2){
				einzelpreis = einzelpreis + (anzahl * 8.60);
				wahl = 0;
			}else if(wahl == 3){
				einzelpreis = einzelpreis + (anzahl * 23.50);
				wahl = 0;
			}else if(wahl == 9){
				//
			}else{
				System.out.println("Ungültige Eingabe, waehlen Sie ein korrektes Ticket oder beenden Sie den Kaufvorgang.");
				wahl = 0;
			}	
		}

		scanner.close();
		
	    return(einzelpreis * anzahl);
	       
	}
}