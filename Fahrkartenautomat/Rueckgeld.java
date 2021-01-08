package Fahrkartenautomat;

public class Rueckgeld {
	public static void rueckgeldAusgeben(double eingezahlterGesamtbetrag, double zuZahlenderBetrag) {
		double rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
	       rueckgabebetrag = Math.round(100 * rueckgabebetrag) / 100.00;
	       if(rueckgabebetrag > 0.0)
	       {
	    	   System.out.printf("Der Rueckgabebetrag in Hoehe von %.2f EURO wird in folgenden Muenzen ausgezahlt:\n", rueckgabebetrag);

	           while(rueckgabebetrag >= 2.0) // 2 EURO-Muenzen
	           {
	        	  System.out.println("2 EURO");
		          rueckgabebetrag -= 2.0;
		          rueckgabebetrag = Math.round(100 * rueckgabebetrag) / 100.00;
	           }
	           while(rueckgabebetrag >= 1.0) // 1 EURO-Muenzen
	           {
	        	  System.out.println("1 EURO");
		          rueckgabebetrag -= 1.0;
		          rueckgabebetrag = Math.round(100 * rueckgabebetrag) / 100.00;
	           }
	           while(rueckgabebetrag >= 0.5) // 50 CENT-Muenzen
	           {
	        	  System.out.println("50 CENT");
		          rueckgabebetrag -= 0.5;
		          rueckgabebetrag = Math.round(100 * rueckgabebetrag) / 100.00;
	           }
	           while(rueckgabebetrag >= 0.2) // 20 CENT-Muenzen
	           {
	        	  System.out.println("20 CENT");
	 	          rueckgabebetrag -= 0.2;
	 	          rueckgabebetrag = Math.round(100 * rueckgabebetrag) / 100.00;
	           }
	           while(rueckgabebetrag >= 0.1) // 10 CENT-Muenzen
	           {
	        	  System.out.println("10 CENT");
		          rueckgabebetrag -= 0.1;
		          rueckgabebetrag = Math.round(100 * rueckgabebetrag) / 100.00;
	           }
	           while(rueckgabebetrag >= 0.05)// 5 CENT-Muenzen
	           {
	        	  System.out.println("5 CENT");
	 	          rueckgabebetrag -= 0.05;
	 	          rueckgabebetrag = Math.round(100 * rueckgabebetrag) / 100.00;
	           }
	       }

	       System.out.println("\nVergessen Sie nicht, den Fahrschein\n"+
	                          "vor Fahrtantritt entwerten zu lassen!\n"+
	                          "Wir wuenschen Ihnen eine gute Fahrt.");
	}

	public static void muenzeAusgeben(int betrag, String einheit){
		// Ich sehe den Sinn nicht hier etwas auszulagern.
	}
}