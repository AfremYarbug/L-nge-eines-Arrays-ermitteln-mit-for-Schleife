package main;

public class Main {

    public static void main(String[] args) {

        int[] werte = {2, 4, 7, 9};

        for (int i = werte.length - 1; i >= 0; i--) {
            System.out.println("Vorwaerts umstaendliche Version: Wert Nr. " + i + ": " + werte[werte.length - 1 - i]);
        }

        System.out.println("-------------------------------------------------");

        for (int i = 0; i < werte.length; i++) {
            System.out.println("Vorwaerts: Wert Nr. " + i + ": " + werte[i]);
        }

        System.out.println("-------------------------------------------------");

        for (int i = 0; i < werte.length; i++) {
            System.out.println("Rueckwaerts umstaendliche Version: Wert Nr. " + i + ": " + werte[werte.length - 1 - i]);
        }

        System.out.println("-------------------------------------------------");

        for (int i = werte.length - 1; i >= 0; i--) {
            System.out.println("Rueckwaerts: Wert Nr. " + i + ": " + werte[i]);
        }
    }
}
