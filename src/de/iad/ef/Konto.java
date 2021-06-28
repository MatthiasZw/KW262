package de.iad.ef;
/***
 *
 +-------------------------------+
 |        Konto			|
 +-------------------------------+
 | - int kontoNr			|
 | - float saldo			|
 | - float kk
 | - String name			|
 +-------------------------------+
 | + Konto( String inhaber)	|
 | + Konto( String inhaber, float kk) |
 | + bool buchung(float betrag)	|
 | + String display()		|
 +-------------------------------+
 */
public class Konto {
    private int kontoNr;
    private float saldo;
    private String name;
    private float kk;

    public Konto(String inhaber) {
        this(inhaber , 0.0f); // Aufruf des Konbstruktors mit den meisten Parametern
        // Ersetzen der fehlenden Parameter mit Default Werten
        // this.name= inhaber;
    }
    public Konto(String inhaber, float kk){
        this.kk= kk;
        this.name=inhaber;
    }
    public boolean buchung(float betrag){
        /*Nach Refactoring */
        float saldo = this.saldo + this.kk;
        if(betrag < 0 && Math.abs(betrag) >saldo ){
            return  false;
        }

        // Kontorrent ausnutzen

        this.saldo+=betrag;
        return  true;
        // Einzahlung  vor Refactoring -- Funktioniert!!!!
      /*  if(betrag>0){
            this.saldo+=betrag;
            return true;
        }else if (  Math.abs(betrag)>saldo){
            return false;
        }else{
            this.saldo +=betrag;
            return true;
        }
*/
    }
    public String display(){

        return String.format("Kunde %s hat kontostand aktuell %.2f Euro", this.name, this.saldo);
    }
}
