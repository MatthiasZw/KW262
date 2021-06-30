package de.iad.ef.firma;

public class Chef extends Mitarbeiter{

    private float boni;

    public Chef(String name, double gehalt) {
        super(name, gehalt);
    }

    public Chef(String name, double gehalt, double boni) {
        super(gehalt);
        super.name= name;
        this.boni=(float)boni;


    }
    public String getName() {
        return super.name;
}

    public float getBoni() {
        return boni;
    }
    public float getGehalt() {
        return super.getGehalt();
    }

    public void setBoni(float boni) {
        if (boni<=0) return;
        this.boni = boni;



    }

    @Override
    public String toString() {
        return super.toString() + " ist ein(e)" + getClass().getSimpleName()+
                "(e) und bekommt " + this.boni + "Euro Boni";
    }
    @Override
    public void Gehaltserhöhung(){
    super.setGehalt((float)super.getGehalt()*1.2f);
    super.Gehaltserhöhung();
    }
    }



