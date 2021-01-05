package Fachmodul_Konsolen_Ein_und_Ausgaben.AB_Konsolenausgabeformatierung;

public class Aufgabe_2 
{

    public static void main (String[] args)
       {
            System.out.printf("%-5s%-19s =%4s\n", "0!", "=", "1");
            System.out.printf("%-5s%-19s =%4s\n", "1!", "= 1", "1");
            System.out.printf("%-5s%-19s =%4s\n", "2!", "= 1 * 2", "2");
            System.out.printf("%-5s%-19s =%4s\n", "3!", "= 1 * 2 * 3", "6");
            System.out.printf("%-5s%-19s =%4s\n", "4!", "= 1 * 2 * 3 * 4", "24");
            System.out.printf("%-5s%-19s =%4s\n", "5!", "= 1 * 2 * 3 * 4 * 5", "120");
       }
    
}
