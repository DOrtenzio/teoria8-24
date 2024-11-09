import prodotti.*;

public class UsaProdotti {
    public static void main(String [] args){
        Prodotto p1=new Prodotto("Patate",2.00,10);
        Prodotto p2=new Prodotto("Noci", 2.50);
        Prodotto p21=new Prodotto("Noci", 2.50);
        ProdottoScontabile p3=new ProdottoScontabile("Cipolle", 1.80, 20,5,25);
        ProdottoScontabile p4=new ProdottoScontabile("Banane",2.00,7,15);

        //Test classi di Prodotto
        //rifornisci()
        p1.rifornisci(15);
        System.out.println(p1.getQuantita());
        //vendi()
        System.out.println("Transazione andata a buon fine ? "+p1.vendi());
        System.out.println(p1.getQuantita());
        System.out.println("Transazione andata a buon fine ? "+p2.vendi());
        //toString()
        System.out.println(p3);
        //equals()
        System.out.println(p1.equals(p4));
        System.out.println(p2.equals(p21));

        //Test classi di ProdottoScontabile
        //vendi()
        System.out.println("Transazione andata a buon fine ? "+p3.vendi(9));
        System.out.println("Transazione andata a buon fine ? "+p4.vendi());

    }
}
