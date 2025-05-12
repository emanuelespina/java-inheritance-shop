package org.lessons.java.shop;

public class Smartphone extends Prodotto {

    private String IMEI;
    private int memoria;

    public Smartphone(String nome, String descrizione, float prezzo, String IMEI, int memoria) {
        // this.nome = nome;
        // this.descrizione = descrizione;
        // this.prezzo = prezzo;
        // this.iva = iva;
        super(nome, descrizione, prezzo);
        this.IMEI = IMEI;
        this.memoria = memoria;
    };

    public Smartphone (){
    };

    public void setIMEI (String IMEI){

        this.IMEI = IMEI;

    };

    public String getIMEI (){
        return this.IMEI;
    };

    public void setMemoria (int memoria){

        if (memoria > 0){
            this.memoria = memoria;
        };
        
    };

    public int getMemoria (){
        return this.memoria;
    };
    
};
