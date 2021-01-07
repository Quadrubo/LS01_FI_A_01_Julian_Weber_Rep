package Fachmodul_Methoden.AB_Methoden_Programmieruebungen;

public class Aufgabe_1 {
    public static void main(String [] args){
        double x = 2.0;
        double y = 4.0;
        double m;
        
        m = mittelwert(x, y);

        System.out.printf("Der Mittelwert von %.2f und %.2f ist %.2f\n", x, y, m);
    }

    public static double mittelwert(double x, double y){
        double m = (x + y) / 2.0;
        return m;
    }
}
