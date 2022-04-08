import java.util.Scanner;

public class RazlomakIspit {
    private int brojnik, nazivnik;

    public void setBrojnik(int brojnik) {
        this.brojnik = brojnik;
    }

    public void setNazivnik(int nazivnik) {
        if (nazivnik == 0)
        throw new IllegalArgumentException("Nula kao nazivnik nije dostupna!");
        else this.nazivnik = nazivnik;
    }

    private static int gcd(int x, int y) {
        return (y == 0) ? x : gcd(y, x % y);
    }

    public void skratiRazlomak() {
        if (this.nazivnik == 0) {
            System.out.println("Nazivnik je nula");
            return;
        }
        
        int DJ = gcd(this.brojnik, this.nazivnik);
        this.brojnik = this.brojnik/DJ;
        this.nazivnik = this.nazivnik/DJ;
        System.out.println("Skraceni razlomak" + this.brojnik + "/" + this.nazivnik);

    }

    public static RazlomakIspit zbrojRazlomke(RazlomakIspit r1, RazlomakIspit r2) {
        RazlomakIspit rezultat = new RazlomakIspit();
        rezultat.setBrojnik(r1.brojnik + r2.brojnik);
        rezultat.setNazivnik(r1.nazivnik + r2.nazivnik);
        return rezultat;
    }

    @Override

    public String toString() {
        return brojnik + "/" + nazivnik;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RazlomakIspit r1 = new RazlomakIspit();
        System.out.println("Unesite brojnik i nazivnik: ");
        r1.setBrojnik(sc.nextInt());
        r1.setNazivnik(sc.nextInt());
        r1.skratiRazlomak();

        RazlomakIspit r2 = new RazlomakIspit();
        System.out.println("unesite brojnik i nazivnik: ");
        r2.setBrojnik(sc.nextInt());
        r2.setNazivnik(sc.nextInt());
        r2.skratiRazlomak();

        System.out.println("Zbroj razlomaka" + r1.toString() + " i " + r2.toString() + " je " + zbrojRazlomke(r1,r2).toString());
        zbrojRazlomke(r1,r2).skratiRazlomak();

        sc.close();

    }






    
}
