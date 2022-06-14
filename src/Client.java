public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private int cp;
    private String ville;

    public Client(String nom, String prenom, String adresse, int cp, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Client{" +
            "nom='" + nom + '\'' +
            ", prenom='" + prenom + '\'' +
            ", adresse='" + adresse + '\'' +
            ", cp=" + cp +
            ", ville='" + ville + '\'' +
            '}';
    }
}
