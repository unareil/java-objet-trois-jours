package hashtables;

import java.time.LocalDate;
import java.util.Hashtable;

public class Mission {
    private String nom;
    private String description;
    private int nbHeuresPrevues;
    private Intervenant intervenant;
    private Hashtable<LocalDate, Integer> releveHoraire;

    public Mission(String nom, String description, int nbHeuresPrevues, Intervenant intervenant) {
        this.nom = nom;
        this.description = description;
        this.nbHeuresPrevues = nbHeuresPrevues;
        this.intervenant = intervenant;
        this.releveHoraire = new Hashtable<LocalDate, Integer>();
    }

    public void ajoutReleve(LocalDate date, int nbreHeures) {
        this.releveHoraire.put(date, nbreHeures);
    }

    public Intervenant getIntervenant() {
        return this.intervenant;
    }

    public Hashtable<LocalDate, Integer> getReleveHoraire() {
        return this.releveHoraire;
    }

    public double nbHeuresEffectuees() {
        double total = 0;
        for (int heure : this.releveHoraire.values())
            total += (double) heure;

        return total;
    }
}
