public class Kvadar extends Pravokutnik {
    private double visina;

    public Kvadar(double duzina, double sirina, double visina) {
        super(duzina, sirina);
        if (visina < 0) {
            visina = 0;
        }
        this.visina = visina;
    }

    public double getVisina() {
        return this.visina;
    }

    public double getVolumen() {
        return this.getSirina() * this.getDuzina() * this.visina;
    }

}
