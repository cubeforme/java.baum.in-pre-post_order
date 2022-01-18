package baum_kompositum;
public class knoten extends baumelement{
    private baumelement liN;
    private baumelement reN;
    private datenelement inhalt;
    
    public knoten(datenelement i){
        super();
        liN=new abschluss();
        reN=new abschluss();
        inhalt=i;
    }
    
    public knoten(datenelement i, baumelement a, baumelement b){
        super();
        liN=a;
        reN=b;
        inhalt=i;
    }
    
    @Override
    public boolean suchen(datenelement wert){
        if (inhalt.eigeneristkleiner(wert)){
            return reN.suchen(wert);
        }
        else{
            if (inhalt==wert){
                return true;
            }
            else{
                return liN.suchen(wert);
            }
        }
    }
    
    @Override
    public baumelement einfuegen(datenelement d){
        if (inhalt==d){
            System.out.println("Das Datenelement ist schon vorhanden");
        }
        else{
            if (inhalt.eigeneristkleiner(d)){
                reN=reN.einfuegen(d);
            }
            else{
                liN=liN.einfuegen(d);
            }
        }
        return this;
    }

    @Override
    public baumelement entfernen(datenelement d){
        if (d!=inhalt){
            if (inhalt.eigeneristkleiner(d)){
                reN=reN.entfernen(d);
            }
            else{
                liN=liN.entfernen(d);
            }
            return this;
        }
        else{
            liN.anfuegenrechts(reN);
            return liN;
        }
    }
    
    public baumelement liNgeben(){
        return liN;
    }
    
    public baumelement reNgeben(){
        return reN;
    }
    
    public void nachfolgersetzen(baumelement a, baumelement b){
        liN=a;
        reN=b;
    }

    @Override
    public baumelement anfuegenrechts(baumelement teilbaum) {
        reN=reN.anfuegenrechts(teilbaum);
        return this;
    }
    
    public int inhaltGeben(){
        return inhalt.nummergeben();
    }

    @Override
    public int anzahlknotengeben() {
        return reN.anzahlknotengeben()+liN.anzahlknotengeben()+1;
    }

    @Override
    public int anzahlebenengeben() {
        if (liN.anzahlebenengeben()>reN.anzahlebenengeben()){
            return liN.anzahlebenengeben()+1;
        }
        else{
            return reN.anzahlebenengeben()+1;
        }
    }

    @Override
    public void inorderausgeben() {
        liN.inorderausgeben();
        System.out.println(inhalt.nummergeben());
        reN.inorderausgeben();
    }

    @Override
    public void preorderausgeben() {
        System.out.println(inhalt.nummergeben());
        liN.inorderausgeben();
        reN.inorderausgeben();
    }

    @Override
    public void postordernausgeben() {
        liN.inorderausgeben();
        reN.inorderausgeben();
        System.out.println(inhalt.nummergeben());
    }
}
