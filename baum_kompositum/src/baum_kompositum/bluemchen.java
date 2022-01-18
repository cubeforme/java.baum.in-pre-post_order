package baum_kompositum;
public class bluemchen {
    private baumelement wurzel;
    
    public bluemchen(){
        wurzel=new abschluss();
    }
    
    public boolean suchen(datenelement wert){
        return wurzel.suchen(wert);
    }
    
    public void einfuegen(datenelement d){
            wurzel=wurzel.einfuegen(d);
    }
    
    public void entfernen(datenelement d){
        wurzel=wurzel.entfernen(d);
    }
    
    public int anzahlknotengeben(){
        return wurzel.anzahlknotengeben();
    }
    
    public int anzahlebenengeben(){
        return wurzel.anzahlebenengeben();
    }
    
    public void inorderausgeben(){
        wurzel.inorderausgeben();
    }
    
    public void preorderausgeben(){
        wurzel.preorderausgeben();
    }
    
    public void postorderausgeben(){
        wurzel.postordernausgeben();
    }
}
