package baum_kompositum;
public class Baum {
    public static void main(String[] args) {
        bluemchen b1=new bluemchen();
        datenelement d1=new datenelement(1);
        datenelement d2=new datenelement(2);
        datenelement d3=new datenelement(3);
        datenelement d4=new datenelement(4);
        datenelement d5=new datenelement(5);
        datenelement d6=new datenelement(6);
        b1.einfuegen(d2);
        b1.einfuegen(d1);
        b1.einfuegen(d3);
        b1.einfuegen(d5);
        //b1.einfuegen(d3);
        b1.entfernen(d5);
        System.out.println(b1.suchen(d5));
        System.out.println("Knotenanzahl: "+b1.anzahlknotengeben());
        System.out.println("Ebenenanzahl: "+b1.anzahlebenengeben());
        System.out.println("In-Order Ausgabe:");
        b1.inorderausgeben();
        System.out.println("Pre-Order Ausgabe:");
        b1.preorderausgeben();
        System.out.println("Post-Order Ausgabe:");
        b1.postorderausgeben();
    }
}
