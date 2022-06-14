package formation;

public class Stagiaire extends Person {
    private String adresse;
    private String codePostal;
    private String ville;

    public Stagiaire(String adresse, String codePostal, String ville) {
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Stagiaire{" +
            "adresse='" + adresse + '\'' +
            ", codePostal='" + codePostal + '\'' +
            ", ville='" + ville + '\'' +
            '}';
    }
}
