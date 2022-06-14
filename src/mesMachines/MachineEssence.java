package mesMachines;

import java.time.LocalDate;

public class MachineEssence extends Machine {
    private int puissanceCV;

    public MachineEssence(LocalDate dateAchat, String marque, String modele, int puissanceCV) {
        super(dateAchat, marque, modele);
        this.puissanceCV = puissanceCV;
    }

    @Override
    public String toString() {
        return "MachineEssence{" +
            "puissanceCV=" + puissanceCV +
            '}';
    }
}
