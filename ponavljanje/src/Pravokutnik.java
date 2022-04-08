public class Pravokutnik {
    private double duzina, sirina;

    public Pravokutnik(double duzina, double sirina) {
        if (duzina < 0) {
            duzina = 0;
        }
        if (sirina < 0) {
            sirina = 0;
        }

        this.duzina = duzina;
        this.sirina = sirina;
    }

    public double getDuzina() {
        return this.duzina;
    }

    public double getSirina() {
        return this.sirina;
    }

    public double getPovrsina() {
        return this.duzina * this.sirina;

    }

}
