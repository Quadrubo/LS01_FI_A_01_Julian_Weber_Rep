package Fachmodul_Datentypen;
/* Operatoren.java
   Uebung zu Operatoren in Java
   @author
   @version
*/
public class Operatoren {
    public static void main(String [] args){
        /* 1. Vereinbaren Sie zwei Ganzzahlen.*/
        int nbr1, nbr2;
  
        System.out.println("UEBUNG ZU OPERATOREN IN JAVA\n");
        /* 2. Weisen Sie den Ganzzahlen die Werte 75 und 23 zu
                und geben Sie sie auf dem Bildschirm aus. */

        nbr1 = 75;
        nbr2 = 23;
        System.out.println(nbr1);
        System.out.println(nbr2);
    
        /* 3. Addieren Sie die Ganzzahlen
                und geben Sie das Ergebnis auf dem Bildschirm aus. */
        System.out.println(nbr1 + nbr2);
    
        /* 4. Wenden Sie alle anderen arithmetischen Operatoren auf die
                Ganzzahlen an und geben Sie das Ergebnis jeweils auf dem
                Bildschirm aus. */
        System.out.println(nbr1 - nbr2);
        System.out.println(nbr1 * nbr2);
        System.out.println(nbr1 / nbr2);
    
        /* 5. Ueberprüfen Sie, ob die beiden Ganzzahlen gleich sind
                und geben Sie das Ergebnis auf dem Bildschirm aus. */
        if(nbr1 == nbr2){
            System.out.println("gleich");
        }else{
            System.out.println("nicht gleich");
        }
    
        /* 6. Wenden Sie drei anderen Vergleichsoperatoren auf die Ganzzahlen an
                und geben Sie das Ergebnis jeweils auf dem Bildschirm aus. */
        if(nbr1 >= nbr2){
            System.out.println("groesser gleich");
        }else{
            System.out.println("nicht groesser gleich");
        }

        if(nbr1 <= nbr2){
            System.out.println("kleiner gleich");
        }else{
            System.out.println("nicht kleiner gleich");
        }

        if(nbr1 != nbr2){
            System.out.println("ungleich");
        }else{
            System.out.println("nicht ungleich");
        }
    
        /* 7. Ueberprüfen Sie, ob die beiden Ganzzahlen im  Interval [0;50] liegen
                und geben Sie das Ergebnis auf dem Bildschirm aus. */

        if((nbr1 >= 0 && nbr1 <= 50) && (nbr2 >= 0 && nbr2 <= 50)){
            System.out.println("liegen beide im intervall");
        }else if(nbr1 >= 0 && nbr1 <= 50){
            System.out.println("nur nbr1 liegt im intervall");
        }else if(nbr2 >= 0 && nbr2 <= 50){
            System.out.println("nur nbr2 liegt im intervall");
        }else{
            System.out.println("liegen beide nicht im intervall");
        }
            
    }//main
  }// Operatoren
  