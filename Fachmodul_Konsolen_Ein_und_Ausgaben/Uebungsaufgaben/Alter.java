package Fachmodul_Konsolen_Ein_und_Ausgaben.Uebungsaufgaben;

import java.util.Scanner;

public class Alter 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Bitte geben Sie Ihr Alter an: ");
        int alter = input.nextInt();

        System.out.println("Sie sind " + alter + " Jahre alt.");

        input.close();
    }
}
