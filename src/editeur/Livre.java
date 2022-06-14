package editeur;

import java.time.Year;

public class Livre {
    private String titre;
    private String auteur;
    private float prix;
    private int nbPages;
    private long isbn;
    private Year annee;

    public Livre() {
    }

    public Livre(String titre, int nbPages, long isbn) {
        this.titre = titre;
        this.nbPages = nbPages;
        this.isbn = isbn;
    }

    public Livre(String titre, String auteur, int nbPages, long isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.isbn = isbn;
    }

    public Livre(String titre, String auteur, float prix, int nbPages, long isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nbPages = nbPages;
        this.isbn = isbn;
    }

    public Livre(String titre, String auteur, float prix, int nbPages, long isbn, Year annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nbPages = nbPages;
        this.isbn = isbn;
        this.annee = annee;
    }

    public Livre(Livre livre) {
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public float getPrix() {
        return prix;
    }

    public int getNbPages() {
        return nbPages;
    }

    public long getIsbn() {
        return isbn;
    }

    public Year getAnnee() {
        return annee;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setAnnee(Year annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Livre{" +
            "titre='" + titre + '\'' +
            ", auteur='" + auteur + '\'' +
            ", prix=" + prix +
            ", nbPages=" + nbPages +
            ", isbn=" + isbn +
            ", annee=" + annee +
            '}';
    }
}
