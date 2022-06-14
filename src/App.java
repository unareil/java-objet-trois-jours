import editeur.Livre;

import java.time.Year;

public class App {
    public static void main(String[] args) {
        Livre l = new Livre("Super titre", "Albert Camus", 12.5f, 128, 190823, Year.now());
        System.out.println(l.toString());
    }
}
