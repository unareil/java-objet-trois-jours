package formation;

import java.util.Date;

public class Formateur extends Person {
    private long numeroIntervenant;
    private Date dateDeCreation;
    private int nombreIntervenant;

    public Formateur(long numeroIntervenant, Date dateDeCreation, int nombreIntervenant) {
        this.numeroIntervenant = numeroIntervenant;
        this.dateDeCreation = dateDeCreation;
        this.nombreIntervenant = nombreIntervenant;
    }

    @Override
    public String toString() {
        return "Formateur{" +
            "numeroIntervenant=" + numeroIntervenant +
            ", dateDeCreation=" + dateDeCreation +
            ", nombreIntervenant=" + nombreIntervenant +
            '}';
    }
}
