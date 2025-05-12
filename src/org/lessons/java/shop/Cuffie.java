package org.lessons.java.shop;

public class Cuffie extends Prodotto {

    private String colore;
    private boolean cablate;

    public Cuffie(String nome, String descrizione, float prezzo, String colore, boolean cablate) {
        // this.nome = nome;
        // this.descrizione = descrizione;
        // this.prezzo = prezzo;
        // this.iva = iva;
        super(nome, descrizione, prezzo);
        this.colore = colore;
        this.cablate = cablate;
    };

    public Cuffie (){
    };

    public void setColore (String colore){

        this.colore = colore;

    };

    public String getColore (){
        return this.colore;
    };

    public void setCablaggio (String cablaggio){

        if (cablaggio.equals("si")){
            this.cablate = true;
        }else{
            this.cablate = false;
        };

    };

    public String getCablaggio (){

        String headphoneType;

        if (this.cablate = true){
            headphoneType = "le cuffie hanno il cavo";
        } else {
            headphoneType = "le cuffie sono wireless";
        };

        return headphoneType;

    };   

}
