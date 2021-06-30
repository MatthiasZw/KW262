package de.iad.ef.firma;

public class Angestellter extends Mitarbeiter{


    public Angestellter(String name, double gehalt) {
        super(name, gehalt);


        }

    @Override
    public String toString() {
        return super.toString() + " ist ein(e)" + getClass().getSimpleName()+"(e)";
    }
}


