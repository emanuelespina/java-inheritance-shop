package org.lessons.java.shop;

public class Televisori extends Prodotto {

    private int pollici;
    private boolean smarTv;

    public Televisori(String nome, String descrizione, float prezzo, int pollici, boolean smarTv) {
        // this.nome = nome;
        // this.descrizione = descrizione;
        // this.prezzo = prezzo;
        // this.iva = iva;
        super(nome, descrizione, prezzo);
        this.pollici = pollici;
        this.smarTv = smarTv;
    };

    public Televisori(){
    };

    public void setPollici (int pollici){
        this.pollici = pollici;
    };

    public int getPollici (){
        return this.pollici;
    };

    public void setSmarTv (String smarTv){
        
        if (smarTv.equals("si")){
            this.smarTv = true;
        }else{
            this.smarTv = false;
        };

    };    

    public String getSmarTv (){

        String tvType;

        if (this.smarTv = true){
            tvType = "televizione smart";
        } else {
            tvType = "televizione non smart";
        };

        return tvType;

    };

}
