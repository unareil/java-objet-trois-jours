package partie4;

public class Proprietaire {
    private String nom;
    private String prenom;

    public Proprietaire(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Proprietaire{" +
            "nom='" + nom + '\'' +
            ", prenom='" + prenom + '\'' +
            '}';
    }
}
