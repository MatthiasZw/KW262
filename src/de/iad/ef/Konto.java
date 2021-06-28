package de.iad.ef;
/***
 *
 +-------------------------------+
 |        Konto			|
 +-------------------------------+
 | - int kontoNr			|
 | - float saldo			|
 | - String name			|
 +-------------------------------+
 | + Konto( String inhaber)	|
 | + bool buchung(float betrag)	|
 | + String display()		|
 +-------------------------------+
 */
public class Konto {
    private int kontoNr;
    private float saldo;
    private String name;

    public Konto(String inhaber){
        //System.out.println("Ein konto wurde erzeugt! ");
        this.name=inhaber;
    }
    public boolean buchung(float betrag){
        /*Nach Refactoring */
        if(betrag < 0 && Math.abs(betrag) >this.saldo){
            return  false;
        }
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
