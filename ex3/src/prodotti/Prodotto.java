package prodotti;

public class Prodotto {
    private String descrizione;
    private double prezzo;
    private int quantita;

    //Costruttore
    public Prodotto(String descrizione,double prezzo,int quantita){
        this.descrizione=descrizione;
        this.prezzo=prezzo;
        this.quantita=quantita;
    }
    public Prodotto(String descrizione,double prezzo){
        this(descrizione,prezzo,0);
    }

    //Metodi
    public void rifornisci(int quantita){ this.quantita+=quantita; }
    public boolean vendi(){
        if (this.quantita<=0)
            return false;
        else{
            System.out.println(this.descrizione+"\t"+this.prezzo);
            this.quantita--;
            return true;
        }
    }
    public String toString(){ return this.descrizione+" : "+this.prezzo+" Quantità presente: "+this.quantita; }
    public boolean equals(Object obj) {
        if (obj instanceof Prodotto){
            Prodotto prodotto=(Prodotto) obj;
            return (this.descrizione.equalsIgnoreCase(prodotto.descrizione) && this.prezzo == prodotto.prezzo && this.quantita == prodotto.quantita);
        }
        return false;
    }

    //get e set
    public double getPrezzo() { return prezzo; }
    public int getQuantita() { return quantita; }
    public String getDescrizione() { return descrizione; }

    public void setDescrizione(String descrizione) { this.descrizione = descrizione; }
    public void setPrezzo(double prezzo) { this.prezzo = prezzo; }
    public void setQuantita(int quantita) { this.quantita = quantita; }
}