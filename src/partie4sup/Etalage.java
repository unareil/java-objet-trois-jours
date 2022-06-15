package partie4sup;

public class Etalage extends Emplacement {
    public Etalage(int couleur, int xCentre, int yCentre) {
        super(couleur, xCentre, yCentre);
    }

    @Override
    public String affiche() {
        return String.format("Emplacement: %d, %d, %d", this.couleur, this.xCentre, this.yCentre);
    }
}
