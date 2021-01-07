package Fachmodul_Methoden.AB_Methoden_Programmieruebungen;

public class Aufgabe_7_Quadrat_Fortsetzung {

    public static void main(String [] args){
        System.out.println(hypotenuse(7, 3));
    }

    public static double quadrat(double x){
        return Math.pow(x, 2);
    }

    public static double hypotenuse(double kathethe1, double kathethe2){
        return Math.sqrt(quadrat(kathethe1) + quadrat(kathethe2));
    }

}
