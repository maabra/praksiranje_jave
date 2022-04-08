public class Razlomak {
    int brojnik;
    int nazivnik;
    int x;
    int y;

    public Razlomak(int brojnik, int nazivnik) {
        this.brojnik = brojnik;
        this.nazivnik = nazivnik;

    }

    public void skratiRazlomak() {
        int zajednickiDjelitelj;
        int skraceniBrojnik;
        int skraceniNazivnik;

        zajednickiDjelitelj = gcd(brojnik, nazivnik);
        skraceniBrojnik = brojnik / zajednickiDjelitelj;
        skraceniNazivnik = nazivnik / zajednickiDjelitelj;

        System.out.println("Skraceno je " + skraceniBrojnik + "/" + skraceniNazivnik);

    }

    private static int gcd(int x, int y) {
        return (y == 0) ? x : gcd(y, x % y);

    }

}