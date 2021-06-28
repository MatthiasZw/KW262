package de.iad.ef;

public class Main {

    public static void main(String[] args) {
        // AP
        Konto konto = new Konto("Rudi Ratlos");
        kontoBuchung(konto, 200 );
        kontoBuchung(konto,-300);
        Konto konto2 = new Konto("Susi Sorglos");

        kontoBuchung(konto2, -200);
    }

    private static void kontoBuchung(Konto konto, float betrag) {
        if (konto.buchung(betrag)) {
            System.out.println("Buchung erfolgreich");
        } else {
            System.out.println("Keine Abbuchung - bitte reden Sie mit der Bank");
        }
        System.out.println(konto.display());
    }
}
