import lettoreMultimediale.Audio;
import lettoreMultimediale.ElementoMultimediale;
import lettoreMultimediale.Immagine;
import lettoreMultimediale.Video;

import java.util.Scanner;

public class LettoreMultimediale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il tipo di elemento: (1=Immagine, 2=Audio, 3=Video): ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

            if (tipo == 1) {
                System.out.println("Inserisci la luminosità: ");
                int luminosita = scanner.nextInt();
                elementi[i] = new Immagine(titolo, luminosita);
            } else if (tipo == 2) {
                System.out.println("Regola il volume: ");
                int volume = scanner.nextInt();

                System.out.println("Inserisci la durata di ascolto in secondi: ");
                int durata = scanner.nextInt();

                elementi[i] = new Audio(titolo, durata, volume);
            } else if (tipo == 3) {
                System.out.println("Inserisci la luminosità: ");
                int luminosita = scanner.nextInt();

                System.out.println("Regola il volume: ");
                int volume = scanner.nextInt();

                System.out.println("Scegli la durata del video: ");
                int durata = scanner.nextInt();

                elementi[i] = new Video(titolo, durata, volume, luminosita);
            } else {
                System.out.println("Tipo non valido! Riprova.");
                i--; //
            }
        }


        while (true) {
            System.out.println("Scegli uno dei 5 elementi (1-5) oppure 0 per uscire: ");
            int scelta = scanner.nextInt();

            if (scelta == 0) {
                System.out.println("Uscita dal lettore multimediale.");
                break;
            }

            if (scelta >= 1 && scelta <= 5) {
                System.out.println("\nInformazioni sull'elemento:");
                System.out.println(elementi[scelta - 1]);
                System.out.println("\nEsecuzione dell'elemento:");
                elementi[scelta - 1].esegui();
            } else {
                System.out.println("Scelta non valida! Riprova.");
            }
        }

        scanner.close();
    }
}
