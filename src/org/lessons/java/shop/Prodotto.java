package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    private Random generator = new Random();

    private int codice;
    private String nome;
    private String descrizione;
    private float prezzo;
    private float iva = 22;    

    public Prodotto (String nome, String descrizione, float prezzo, float iva){
        this.codice = generator.nextInt(111111111, 999999999); 
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
        
    };

    public Prodotto (String nome, String descrizione, float prezzo){
         this.codice = generator.nextInt(111111111, 999999999); 
         this.nome = nome;
         this.descrizione = descrizione;
         this.prezzo = prezzo;               
    };

    public Prodotto (){
    };

    public void setNome (String nome){
        this.nome = nome;
    };

    public String getNome (){
        return this.nome;
    };

    public void setDescrizione (String descrizione){
        this.descrizione = descrizione;
    };

    public String getDescrizione (){
        return this.descrizione;
    };

    public float getPrezzoBase (){
        return this.prezzo;
    };

    public void setPrezzoBase (float prezzo){
        this.prezzo = prezzo;
    };       

    public float getPrezzoIvato (){
        return this.prezzo + (this.prezzo * this.iva)/100;
    };

    public String getNomeCompleto (){
        return this.codice + "-" + this.nome;
    };
    
}
