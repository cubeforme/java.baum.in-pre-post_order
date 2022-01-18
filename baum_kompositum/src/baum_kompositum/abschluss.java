package baum_kompositum;
public class abschluss extends baumelement{
    public abschluss(){
        super();
    }

    @Override
    public boolean suchen(datenelement wert) {
        return false;
    }

    @Override
    public baumelement einfuegen(datenelement d) {
        knoten k1 = new knoten(d, this, this);
        return k1;
    }

    @Override
    public baumelement entfernen(datenelement d) {
        return this;
    }

    @Override
    public baumelement anfuegenrechts(baumelement teilbaum) {
        return teilbaum;
    }

    @Override
    public int anzahlknotengeben() {
        return 0;
    }

    @Override
    public int anzahlebenengeben() {
        return 0;
    }

    @Override
    public void inorderausgeben() {
        
    }

    @Override
    public void preorderausgeben() {
        
    }

    @Override
    public void postordernausgeben() {
        
    }
}
