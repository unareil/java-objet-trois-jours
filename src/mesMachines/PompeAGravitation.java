package mesMachines;

import java.time.LocalDate;

public class PompeAGravitation extends Machine {
    private int debit;
    private boolean eauOperationnelle;

    public PompeAGravitation(LocalDate dateAchat, String marque, String modele, int debit, boolean eauOperationnelle) {
        super(dateAchat, marque, modele);
        this.debit = debit;
        this.eauOperationnelle = eauOperationnelle;
    }

    @Override
    public String toString() {
        return "PompeAGravitation{" +
            "debit=" + debit +
            ", eauOperationnelle=" + eauOperationnelle +
            '}';
    }
}
