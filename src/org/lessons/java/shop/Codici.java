package org.lessons.java.shop;

public final class Codici {

    public static final String riempitore (String numero){

        String codiceCompleto = "";

        for (int i = 0; i < 8; i++){

            if (i < numero.length()) {
                codiceCompleto += numero.charAt(i);                
            }else {
                codiceCompleto = "0" + codiceCompleto;
            }            

        }

        return codiceCompleto;
    }

}
