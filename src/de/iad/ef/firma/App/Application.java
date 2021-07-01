package de.iad.ef.firma.App;


import de.iad.ef.firma.Angestellter;
import de.iad.ef.firma.Azubi;
import de.iad.ef.firma.Chef;
import de.iad.ef.firma.Mitarbeiter;


import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Mitarbeiter> iad = new ArrayList<>();
        iad.add(new Azubi("Fritze Freitag", 345));
        iad.add(new Chef("Rudi", 3456.0, 2000));
        iad.add(new Angestellter("susi",3457));
        System.out.println("Vor Gehaltserhöhung:  ");
        for (Mitarbeiter m : iad) {
            System.out.println(m);
            m.Gehaltserhöhung();

        }
        System.out.println("Nach Gehaltserhöhung: ");
        iad.forEach((m)->System.out.println(m));




       /* //Ap

        Mitarbeiter toni = new Chef("Rudi", 3456.0, 2000);

        //System.out.printf("%s bekommt %.2f Euro Gehalt und %.2f Boni\n  ", toni.getName(), toni.getGehalt(), toni.getBoni());


        Mitarbeiter susi = new Angestellter("susi",3457);


        Mitarbeiter fritze =new Azubi("Fritze Freitag", 345);

        System.out.println(fritze);
        System.out.println(toni);
        System.out.println(susi);*/
    }



}
