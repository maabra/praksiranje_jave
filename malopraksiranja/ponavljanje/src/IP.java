public class IP {

    private int a, b, c, d;

    public IP(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    void ispis() {
        System.out.println(this.a + "." + this.b + "." + this.c + "." + this.d);
        System.out.println(imeKlase());
    }

    char imeKlase() {
        // 1 - 127, 128-191, 192 - 223, 224 - 239, 240-255
        if (a >= 1 && a <= 127) {
            return 'A';
        } else if (a >= 128 && a <= 191) {
            return 'B';
        } else if (a >= 192 && a <= 223) {
            return 'C';
        } else if (a >= 224 && a <= 239) {
            return 'D';
        } else if (a >= 224 && a <= 239) {
            return 'E';
        } else
            return 'X';
    }

}
