package partie4sup;

public class Terrasse extends Emplacement {
    public Terrasse(int couleur, int xCentre, int yCentre) {
        super(couleur, xCentre, yCentre);
    }

    @Override
    public String affiche() {
        return String.format("Terrasse: %d, %d, %d", this.couleur, this.xCentre, this.yCentre);
    }
}
