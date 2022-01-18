package baum_kompositum;
public class datenelement {
    private int nummer;
    
    public datenelement(int n){
        nummer=n;
    }
    
    public boolean suchen(){
        return false;
    }
    
    public boolean eigeneristkleiner(datenelement d){
        if(nummer<d.nummergeben()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int nummergeben(){
        return nummer;
    }
}
