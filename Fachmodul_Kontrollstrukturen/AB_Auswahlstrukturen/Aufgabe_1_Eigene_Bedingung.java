package Fachmodul_Kontrollstrukturen.AB_Auswahlstrukturen;

public class Aufgabe_1_Eigene_Bedingung {
    public static void main(String [] args){
        //1) WENN Ampel grün DANN Über die Straße gehen

        int zahl1 = 2;
        int zahl2 = 2;
        int zahl3 = 2;

        // 2.
        if(zahl1 == zahl2){
            System.out.println("Die beiden zahlen sind gleich!");
        }

        // 3.
        if(zahl2 > zahl1){
            System.out.println("Zahl2 ist groesser als Zahl1!");
        }

        // 4.
        if(zahl1 >= zahl2){
            System.out.println("Zahl1 ist groesser oder gleich Zahl2!");
        }else{
            System.out.println("Zahl1 ist nicht groesser oder gleich Zahl2!");
        }

        // 1.
        if((zahl1 > zahl2) && (zahl1 > zahl3)){
            System.out.println("Zahl1 ist groesser als Zahl2 und groesser als zahl3!");
        }

        // 2.
        if((zahl3 > zahl2) || (zahl3 > zahl1)){
            System.out.println("Zahl3 ist groesser als Zahl2 oder groesser als zahl1!");
        }

        // 3.
        if((zahl1 > zahl2) && (zahl1 > zahl3)){
            System.out.println(zahl1);
        }else if((zahl2 > zahl1) && (zahl2 > zahl3)){
            System.out.println(zahl2);
        }else if((zahl3 > zahl1) && (zahl3 > zahl2)){
            System.out.println(zahl3);
        }else{
            System.out.println("Manche sind gleich gross");
        }

    }
}
