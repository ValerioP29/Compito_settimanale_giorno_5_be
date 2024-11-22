package lettoreMultimediale;

public abstract class ElementoMultimediale {
    protected String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public abstract void esegui();

    public abstract String toString();
}
