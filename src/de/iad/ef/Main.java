package de.iad.ef;

import utils.IOPaneTools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        // AP
        //Konto [] bank24 = new Konto[100];
        List<Konto> bank24 = new ArrayList<Konto>();
        // List<Konto> test= new Vector();

        while(kontoEroffnung(bank24));
        System.out.println("Feierabend");
    }

    private static boolean kontoEroffnung(List<Konto> bank) {
        String name=IOPaneTools.readline("Bitte Kontoinhaber");
        if(name.isEmpty()){
            return false;
        }
        //Konto tempKonto = new Konto(name);
        bank.add(new Konto(name));
        return true;

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
