import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Print {
    public static void print(File f) {

        String datoteka = f.getAbsolutePath();
        System.out.println(datoteka);
        try {
            FileReader kraj = new FileReader(datoteka);
            BufferedReader ulaz = new BufferedReader(kraj);
            String linija = " ";
            while ((linija = ulaz.readLine()) != null) {

                System.out.println(linija);

            }
            ulaz.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
