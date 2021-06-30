package de.iad.ef.firma.App;

import com.sun.org.apache.xerces.internal.impl.xs.XSAttributeUseImpl;
import de.iad.ef.firma.Angestellter;
import de.iad.ef.firma.Azubi;
import de.iad.ef.firma.Chef;
import de.iad.ef.firma.Mitarbeiter;

import java.sql.SQLOutput;

public class Application extends Object{

    public static void main(String[] args) {
        //Ap
        Chef toni = new Chef("Rudi", 3456.0, 2000);

        System.out.printf("%s bekommt %.2f Euro Gehalt und %.2f Boni\n  ", toni.getName(), toni.getGehalt(), toni.getBoni());
        System.out.println(toni);

        Angestellter susi = new Angestellter("susi",3457);
        System.out.println(susi);

        Azubi fritze = new Azubi("Fritze Freitag", 345);
        System.out.println(fritze);
    }



}
