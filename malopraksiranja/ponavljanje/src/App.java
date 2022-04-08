import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int brojnik = 0;
        int nazivnik = 0;

        Scanner novi_broj = new Scanner(System.in);
        System.out.println("------------------------1. kol 1. zad - Razlomci------------------------");
        while (brojnik == 0) {
            System.out.println("Nazivnik:");
            brojnik = novi_broj.nextInt();
        }

        while (nazivnik == 0) {
            System.out.println("Brojnik:");
            nazivnik = novi_broj.nextInt();
        }

        Razlomak novi = new Razlomak(brojnik, nazivnik);

        novi.skratiRazlomak();
        System.out.println("------------------------1. kol 2. zad - IP------------------------");
        int prviOktet = 0;
        int drugiOktet = 0;
        int treciOktet = 0;
        int cetvrtiOktet = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("1:");
        while (prviOktet < 1 || prviOktet > 255) {
            prviOktet = sc.nextInt();
        }

        System.out.println("2:");
        while (drugiOktet < 1 || drugiOktet > 255) {
            drugiOktet = sc.nextInt();
        }
        System.out.println("3:");
        while (treciOktet < 1 || treciOktet > 255) {
            treciOktet = sc.nextInt();
        }
        System.out.println("4:");
        while (cetvrtiOktet < 1 || cetvrtiOktet > 255) {
            cetvrtiOktet = sc.nextInt();
        }

        IP ip = new IP(prviOktet, drugiOktet, treciOktet, cetvrtiOktet);
        ip.ispis();

        System.out.println("------------------------2. kol - Geometrija------------------------");

        double drugiPravDuz = 0;
        double drugiPravSir = 0;
        double drugiKvadDuz = 0;
        double drugiKvadSir = 0;
        double drugiKvadVis = 0;
        Scanner scTreci = new Scanner(System.in);
        // prvi pravokutnik
        Pravokutnik pravokutnik1 = new Pravokutnik(2.5, 3.6);
        double velicina1 = pravokutnik1.getPovrsina();
        System.out.println("Prvi pravokutnik je D " + pravokutnik1.getDuzina() + " x S " + pravokutnik1.getSirina());
        System.out.println("P prvog pravokutnika: " + velicina1);
        // drugi pravokutnik s upisom
        System.out.println("Unesite duzinu drugog pravokutnika (primjer: 12,34):");
        drugiPravDuz = scTreci.nextDouble();
        System.out.println("Unesite sirinu drugog pravokutnika (primjer: 12,34):");
        drugiPravSir = scTreci.nextDouble();
        Pravokutnik pravokutnik2 = new Pravokutnik(drugiPravDuz, drugiPravSir);
        double velicina2 = pravokutnik2.getPovrsina();
        System.out.println("Drugi pravokutnik je D " + pravokutnik2.getDuzina() + " x S " + pravokutnik2.getSirina());
        System.out.println("P drugog pravokutnika: " + velicina2);
        // prvi kvadar
        Kvadar kvadar1 = new Kvadar(3.7, 2.5, 2.23);
        double velicina3 = kvadar1.getPovrsina();
        double volumen1 = kvadar1.getVolumen();
        System.out.println("Prvi kvadar je D " + kvadar1.getDuzina() + " x S " + kvadar1.getSirina() + " x V "
                + kvadar1.getVisina());
        System.out.println("P prvog kvadra: " + velicina3);
        System.out.println("V prvog kvadra: " + volumen1);
        // drugi kvadar s upisom
        System.out.println("Unesite duzinu drugog kvadra (primjer: 12,34):");
        drugiKvadDuz = scTreci.nextDouble();
        System.out.println("Unesite sirinu drugog kvadra (primjer: 12,34):");
        drugiKvadSir = scTreci.nextDouble();
        System.out.println("Unesite visinu stranicu drugog kvadra (primjer: 12,34):");
        drugiKvadVis = scTreci.nextDouble();
        Kvadar kvadar2 = new Kvadar(drugiKvadDuz, drugiKvadSir, drugiKvadVis);
        double velicina4 = kvadar2.getPovrsina();
        double volumen2 = kvadar2.getVolumen();
        System.out.println("Drugi kvadar je D " + kvadar2.getDuzina() + " x S " + kvadar2.getSirina()
                + " x V " + kvadar2.getVisina());
        System.out.println("P drugog kvadra: " + velicina4);
        System.out.println("V drugog kvadra: " + volumen2);

        System.out.println("------------------------3. kol - Kalkulator------------------------");
        Scanner scCetvrti = new Scanner(System.in);
        int prviBroj = 0;
        int drugiBroj = 0;
        
    }
}
