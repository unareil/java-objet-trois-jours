package heritage;

public class Individu {
    private String prenom;
    private String nom;

    public Individu(String prenom, String nom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "prénom=" + getPrenom() + ", nom=" + getNom();
    }
}
