package Fahrkartenautomat;

public class Fahrscheinausgabe {
	public static void fahrkartenAusgeben() {
		System.out.println("\nFahrschein wird ausgegeben");
        for (int i = 0; i < 8; i++)
        {
           System.out.print("=");
           warte(250);
        }
       System.out.println("\n\n");
    }

    public static void warte(int millisekunde){
        try {
            Thread.sleep(millisekunde);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block			
            e.printStackTrace();
        }
    }
}