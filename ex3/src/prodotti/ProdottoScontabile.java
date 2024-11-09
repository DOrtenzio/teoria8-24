package prodotti;

public class ProdottoScontabile extends Prodotto{
    private int quantitaMinimaXSconto;
    private double percentualeDiSconto;

    public ProdottoScontabile(String descrizione, double prezzo, int quantita, int quantitaMinimaXSconto, double percentualeDiSconto) {
        super(descrizione, prezzo, quantita);
        this.quantitaMinimaXSconto=quantitaMinimaXSconto;
        this.percentualeDiSconto=percentualeDiSconto;
    }
    public ProdottoScontabile(String descrizione, double prezzo, int quantitaMinimaXSconto, double percentualeDiSconto) {
        this(descrizione,prezzo,0,quantitaMinimaXSconto,percentualeDiSconto);
    }

    public boolean vendi(int quantitaDaVendere){
        if (super.getQuantita()<=0 || quantitaDaVendere<=0)
            return false;
        else{
            double prezzo;
            if (quantitaDaVendere >= this.quantitaMinimaXSconto)
                prezzo=(super.getPrezzo()*quantitaDaVendere)*(percentualeDiSconto/100);
            else
                prezzo=super.getPrezzo()*quantitaDaVendere;

            System.out.println(super.getDescrizione()+"\tTot: "+prezzo+"\t Pezzi:"+quantitaDaVendere);
            super.setQuantita(super.getQuantita() - quantitaDaVendere);
            return true;
        }
    }
}
