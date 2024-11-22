package lettoreMultimediale;

public class Video extends ElementoMultimediale implements Play {
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public void alzaVolume() {
        volume++;
    }
    public void abbassaVolume() {
        if (volume>0)
            volume--;

    }


    public void alzaLuminosita() {
        luminosita++;
    }
    public void diminuisciLuminosita() {
        if (luminosita>0)
            luminosita-- ;

    }
    @Override
    public void setVolume(int nuovoVolume) {
        this.volume = nuovoVolume;
        System.out.println("Volume impostato a: " + nuovoVolume);
    }
    @Override
    public void setLuminosita(int nuovaLuminosita) {
        this.luminosita = nuovaLuminosita;
        System.out.println("Nuova luminosità impostata a: " + nuovaLuminosita);
    }

    @Override
    public void play() {
        int durataRimanente= durata;
        while (durataRimanente > 0) {
            System.out.println(titolo + " " + "!".repeat(volume) + "*".repeat(luminosita));
            durataRimanente--;
        }
        System.out.println("Riproduzione completata.");
    }

    @Override
    public void esegui() {
        play();
    }

    @Override
    public String toString() {
        return "Video - Titolo: " + titolo + " Durata: " + durata + " Volume: " + volume + " Luminosità: " + luminosita;
    }
}
