package heritage;

public class Salarie extends Individu {
    private int salaire;

    public Salarie(String prenom, String nom, int salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return super.toString() + ", salaire=" + getSalaire() + "€/mois";
    }
}
