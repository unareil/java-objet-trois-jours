package partie4sup;

import java.util.ArrayList;

public class Plan {
    private int echelle;
    private String nomFichier;
    private ArrayList<Emplacement> emplacements;

    public Plan(String nomFichier) {
        this.nomFichier = nomFichier;
        this.emplacements = new ArrayList<Emplacement>();
    }

    public Plan(int echelle, String nomFichier) {
        this.echelle = echelle;
        this.nomFichier = nomFichier;
        this.emplacements = new ArrayList<Emplacement>();
    }

    public void ajouteEmplacement(Emplacement emplacement) {
        this.emplacements.add(emplacement);
    }

    public void supprimeEmplacement(Emplacement e) {
        this.emplacements.remove(e);
    }

    private String afficherEmplacements() {
        StringBuilder builder = new StringBuilder();
        for (Emplacement e : this.emplacements)
            builder.append(e.affiche());

        return builder.toString();
    }

    public String affiche() {
        return "Plan{" +
            "echelle=" + echelle +
            ", nomFichier='" + nomFichier + '\'' +
            ", emplacements=" + this.afficherEmplacements() +
            '}';
    }
}
