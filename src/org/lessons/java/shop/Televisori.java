package org.lessons.java.shop;

public class Televisori extends Prodotto {

    protected int pollici;
    protected boolean smarTv;

    public Televisori(String nome, String descrizione, float prezzo, float iva, int pollici, boolean smarTv) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
        this.pollici = pollici;
        this.smarTv = smarTv;
    };

}
