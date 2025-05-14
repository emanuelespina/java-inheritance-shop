package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // voi aggiungere un prodotto al carrello?

        boolean addItems = true;

        System.out.println(Codici.riempitore("12674"));

        while (addItems != false) {

            System.out.println("Vuoi aggiungere un'articolo al tuo carrello?");

            String requestAddItems = scanner.nextLine();

            if (requestAddItems.equals("si")) {
                addItems = true;

                System.out.println("Che articolo vuoi aggiungere?");

                String productYpe = scanner.nextLine();

                switch (productYpe) {
                    case "Smartphone":

                        Smartphone smartphone = new Smartphone();

                        System.out.println("Digita il nome del tuo smartphone");

                        smartphone.setNome(scanner.nextLine());

                        System.out.println("Digita la descrizione del prodotto");

                        smartphone.setDescrizione(scanner.nextLine());

                        System.out.println("Digita il prezzo");

                        smartphone.setPrezzoBase(scanner.nextFloat());

                        System.out.println("Immetti il codice IMEI");

                        smartphone.setIMEI(scanner.nextLine());

                        System.out.println("Digita la capacità di memoria");

                        smartphone.setMemoria(scanner.nextInt());

                        break;

                    case "Televisore":

                        Televisori televisore = new Televisori();

                        System.out.println("Digita il nome del tuo televisore");

                        televisore.setNome(scanner.nextLine());

                        System.out.println("Digita la descrizione del prodotto");

                        televisore.setDescrizione(scanner.nextLine());

                        System.out.println("Digita il prezzo");

                        televisore.setPrezzoBase(scanner.nextFloat());

                        System.out.println("quanti pollici è grande la TV");

                        televisore.setPollici(scanner.nextInt());

                        System.out.println("la TV è smart?");

                        televisore.setSmarTv(scanner.nextLine());

                        break;

                    case "Cuffia":

                        Cuffie cuffie = new Cuffie();

                        System.out.println("Digita il nome della tua cuffia");

                        cuffie.setNome(scanner.nextLine());

                        System.out.println("Digita la descrizione del prodotto");

                        cuffie.setDescrizione(scanner.nextLine());

                        System.out.println("Digita il prezzo");

                        cuffie.setPrezzoBase(scanner.nextFloat());

                        System.out.println("Digita il colore delle cuffie");

                        cuffie.setColore(scanner.nextLine());

                        System.out.println("le cuffie sono cablate?");

                        cuffie.setCablaggio(scanner.nextLine());

                        break;

                    default:
                        break;
                }

            } else {
                addItems = false;
            };

        };

        scanner.close();

        

        

    };

}
