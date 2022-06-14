import editeur.Livre;
import heritage.Individu;
import heritage.Salarie;

import java.time.Year;

public class App {
    public static void main(String[] args) {
        Livre l = new Livre("Super titre", "Albert Camus", 12.5f, 128, 190823, Year.now());
        System.out.println(l.toString());

        Individu am = new Individu("Aurélien", "Martineau");
        System.out.println("Individu =" + am.toString());
        Salarie ak = new Salarie("Alain", "Kerlero", 5000);
        System.out.println("Individu : " + am.toString());
        System.out.println("Salarie : " + ak.toString());
    }
}
