package Fahrkartenautomat;

public class Fahrkartenautomat
{
    public static void main(String[] args){    
        boolean infinity = true;
        
        while(infinity){
            double zuZahlenderBetrag;
            double eingezahlterGesamtbetrag;

            
            zuZahlenderBetrag = Bestellung.fahrkartenbestellungErfassen();

            // Geldeinwurf
            // -----------
            
            eingezahlterGesamtbetrag = Geldeinwurf.fahrkartenBezahlen(zuZahlenderBetrag);

            // Fahrscheinausgabe
            // -----------------
            
            Fahrscheinausgabe.fahrkartenAusgeben();

            // Rückgeldberechnung und -Ausgabe
            // -------------------------------
            
            Rueckgeld.rueckgeldAusgeben(eingezahlterGesamtbetrag, zuZahlenderBetrag);
        }
    }
}