package org.lessons.java.shop;

public class Cuffie extends Prodotto {

    protected String colore;
    protected boolean cablate;

    public Cuffie(String nome, String descrizione, float prezzo, float iva, String colore, boolean cablate) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
        this.colore = colore;
        this.cablate = cablate;
    };

    


}
