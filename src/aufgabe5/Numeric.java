package aufgabe5;

public class Numeric {

    static String geradeZahl (int a)  {
        if (a%2 == 0) {
            return "Die_uebergebene_Zahl_ist_gerade";
        }
        else {
            return "Die_uebergebene_Zahl_ist_ungerade";
        }
    }

    // Methode zur Berechnung des Quadrats
    static int getQuadrat (int a) {
        int quadrat = a * a ;
        return quadrat;
    }

    // Methode zur Berechnung des Quadrats
    static int getWürfel (int a) {
        int würfel = a * a * a;
        return würfel;
    }


    public static void main (String[] args) {
        int a = 5; int b = 6;

        // Test zur Ausgabe, ob übergebene Zahl „gerade“ oder „ungerade“
        System.out.println (geradeZahl(a));
        System.out.println (geradeZahl(b));

        /* Test zur Ausgabe, was als Quadrat ermittelt wird*/
        System.out.println (getQuadrat(a));
        System.out.println (getQuadrat(b));

        /* Test zur Ausgabe der Würfel-Berechnungas */
        System.out.println (getWürfel(a));
        System.out.println (getWürfel(b));

    }

}
