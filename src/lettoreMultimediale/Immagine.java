package lettoreMultimediale;

public class Immagine extends ElementoMultimediale{
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }
    public void diminuisciLuminosita() {
        if (luminosita >0)
            luminosita--;

    }
    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosita));
    }


    @Override
    public void esegui() {
        show();
    }

    @Override
    public String toString() {
        return "Immagine - Titolo: " + titolo + " Luminosità: " + luminosita;
    }
}
