import java.util.Random;

public class Pass {
    static char[] genPass(int duljina) {
        String velikaSlova = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String malaSlova = "abcdefghijklmnopqrstuvwxyz";
        String brojevi = "1234567890";
        String zajedno = velikaSlova + malaSlova + brojevi;
        Random rnd = new Random();

        char[] pass = new char[duljina];

        for (int i = 0; i < duljina; i++) {

            pass[i] = zajedno.charAt(rnd.nextInt(zajedno.length()));
        }
        return pass;
    }
}
