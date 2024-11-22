package lettoreMultimediale;

public abstract class ElementoMultimediale {
    protected String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }



    public void alzaVolume() {

    }

    public void abbassaVolume() {

    }

    public void alzaLuminosita() {

    }

    public void diminuisciLuminosita() {

    }

    public abstract void esegui();

    public void setVolume(int nuovoVolume) {
        System.out.println("Questo elemento non supporta la modifica del volume");
    }

    public void setLuminosita(int nuovaLuminosita) {
        System.out.println("Questo elemento non supporta la modifica della luminosità");

    }


    public abstract String toString();
}
