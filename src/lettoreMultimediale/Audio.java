package lettoreMultimediale;

public class Audio extends ElementoMultimediale implements Play{
    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public void alzaVolume() {
        volume++;
    }
    public void abbassaVolume() {
        if (volume>0)
            volume--;

    }

    @Override
    public void esegui() {
    play();
    }

    @Override
    public String toString() {
        return "Audio - Titolo: " + titolo + " Durata: " + durata + " Volume: " + volume;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume));
        }
        System.out.println("Riproduzione completata.");
    }
}
