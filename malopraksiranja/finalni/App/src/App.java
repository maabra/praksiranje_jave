import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);
        int brojStudenata;
        LinkedList<Student> lista = new LinkedList<Student>();

        System.out.println("Ukupan broj studenata?");
        brojStudenata = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= brojStudenata; i++){
           
        System.out.println("Ime "+ i +". studenta?");
        String imeStudenta = scanner.nextLine();
        System.out.println("Prezime "+ i +". studenta?"); 
        String prezimeStudenta = scanner.nextLine();
        System.out.println("Godina "+ i +". studenta?");
        int godinaStudenta = scanner.nextInt();
        scanner.nextLine();
        lista.add(new Student(imeStudenta, prezimeStudenta, godinaStudenta));
        }
        scanner.close();

        File datoteka = new File(".\\src\\baza_studenata.csv");
        FileWriter writer = new FileWriter(datoteka);

        for (int i = 0; i < lista.size(); i++){

            writer.append(String.valueOf(lista.get(i)));
            writer.append("\n");

        }
        writer.close();

        Print.print(datoteka);

        
    }
}
