package partie4;

import java.awt.Color;

public class Voiture {
    private int numSerie;
    private String immat;
    private String marque;
    private Color color;
    private String annee;

    private Proprietaire proprietaire;

    public Voiture(int numSerie, String immat, String marque, Color color, String annee) {
        this.numSerie = numSerie;
        this.immat = immat;
        this.marque = marque;
        this.color = color;
        this.annee = annee;
    }

    public void klaxonner() {
        System.out.println("Honk Honk!");
    }

    public void demarrer() {
        System.out.println("La voiture demarre...");
    }

    public void arreter() {
        System.out.println("La voiture s'arrete...");
    }

    public int getNumSerie() {
        return numSerie;
    }

    public String getImmat() {
        return immat;
    }

    public String getMarque() {
        return marque;
    }

    public Color getColor() {
        return color;
    }

    public String getAnnee() {
        return annee;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setImmat(String immat) {
        this.immat = immat;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }

    @Override
    public String toString() {
        return "Voiture{" +
            "numSerie=" + numSerie +
            ", immat='" + immat + '\'' +
            ", marque='" + marque + '\'' +
            ", color='" + color + '\'' +
            ", annee='" + annee + '\'' +
            ", proprietaire=" + proprietaire +
            '}';
    }
}
