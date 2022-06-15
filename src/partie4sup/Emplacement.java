package partie4sup;

abstract public class Emplacement {
    private int dimension;
    protected int couleur;
    protected int xCentre;
    protected int yCentre;

    protected Emplacement(int couleur, int xCentre, int yCentre) {
        this.couleur = couleur;
        this.xCentre = xCentre;
        this.yCentre = yCentre;
    }

    abstract public String affiche();
}
