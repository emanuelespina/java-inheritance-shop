package org.lessons.java.shop;

public class Smarphone extends Prodotto {

    protected int IMEI;
    protected int memoria;

    public Smarphone(String nome, String descrizione, float prezzo, float iva, int IMEI, int memoria) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
        this.IMEI = IMEI;
        this.memoria = memoria;
    };

    
};
