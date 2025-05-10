package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        
       Televisori samsung = new Televisori("TV serie 9", "tv oled con nuova tecnologia dei neri", 1300, 55, true);
            
       System.out.println(samsung.getPrezzoIvato());

       samsung.setDescrizione("prova cambio descrizione");

       System.out.println(samsung.getDescrizione());

    };       

}


