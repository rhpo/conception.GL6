package TP4GL;

public class Vehicule {
    private int immatricule;
    private String marque;
    private Technicien conducteur;

    public Vehicule(int immatricule, String marque) {
        this.immatricule = immatricule;
        this.marque = marque;
    }

    public void setConducteur(Technicien t) {
        this.conducteur = t;
        if (t != null && t.getVehicule() != this) {
            t.ajouterVehicule(this);
        }
    }

    public int getImmatricule() { return immatricule; }
    public String getMarque() { return marque; }
    public Technicien getConducteur() { return conducteur; }

    @Override
    public String toString() {
        return "Vehicule{" +
                "immatricule=" + immatricule +
                ", marque='" + marque + '\'' +
                '}';
    }
}
