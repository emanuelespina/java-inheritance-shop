package org.lessons.java.shop;

public class Smarphone extends Prodotto {

    protected int IMEI;
    protected int memoria;

    public Smarphone(String nome, String descrizione, float prezzo, int IMEI, int memoria) {
        // this.nome = nome;
        // this.descrizione = descrizione;
        // this.prezzo = prezzo;
        // this.iva = iva;
        super(nome, descrizione, prezzo);
        this.IMEI = IMEI;
        this.memoria = memoria;
    };

    
};
