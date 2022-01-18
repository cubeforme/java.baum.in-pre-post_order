package baum_kompositum;
public abstract class baumelement {
    public abstract boolean suchen(datenelement wert);
    public abstract baumelement einfuegen(datenelement d);
    public abstract baumelement entfernen(datenelement d);
    public abstract baumelement anfuegenrechts(baumelement teilbaum);
    public abstract int anzahlknotengeben();
    public abstract int anzahlebenengeben();
    public abstract void inorderausgeben();
    public abstract void preorderausgeben();
    public abstract void postordernausgeben();
}
