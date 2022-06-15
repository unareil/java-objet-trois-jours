package hashtables;

import java.time.LocalDate;
import java.util.ArrayList;

public class Projet {
    private String nom;
    private LocalDate debut;
    private LocalDate fin;
    private double prixFactureMO;
    private ArrayList<Mission> missions;

    public Projet(String nom, LocalDate debut, LocalDate fin, double prixFactureMO, ArrayList<Mission> missions) {
        this.nom = nom;
        this.debut = debut;
        this.fin = fin;
        this.prixFactureMO = prixFactureMO;
        this.missions = missions;
    }

    public double cumulCoutMo() {
        double total = 0;
        for (Mission mission : this.missions)
            total += mission.nbHeuresEffectuees() * mission.getIntervenant().getTauxHoraire();

        return total;
    }

    public double margeBruteCourante() {
        return this.prixFactureMO - this.cumulCoutMo();
    }
}
