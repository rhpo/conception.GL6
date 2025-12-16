package TP4GL;

import java.util.ArrayList;
import java.util.List;

public class Fournisseur {

    private int numRC;
    private String raisonSocial;
    private String adresse;
    private double capital;

    
    private List<Equipement> equipements;

    public Fournisseur(int numRC, String raisonSocial, String adresse, double capital) {
        this.numRC = numRC;
        this.raisonSocial = raisonSocial;
        this.adresse = adresse;
        this.capital = capital;
        this.equipements = new ArrayList<>();
    }

    public void ajouterEquipement(Equipement e) {
        if (e != null && !equipements.contains(e)) {
            equipements.add(e);
            e.setFournisseur(this); 
        }
    }

    /**
     * Removes the specified Equipement and sets its Fournisseur to null if it exists.
     */
    public void supprimerEquipement(Equipement e) {
        if (e != null && equipements.remove(e)) {
            e.setFournisseur(null);
        }
    }


    /**
     * Returns the value of numRC.
     */
    public int getNumRC() {
        return numRC;
    }

    /**
     * Sets the value of numRC.
     */
    public void setNumRC(int numRC) {
        this.numRC = numRC;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    /**
     * Returns the adresse.
     */
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Returns the current capital amount.
     */
    public double getCapital() {
        return capital;
    }

    /**
     * Sets the value of capital.
     */
    public void setCapital(double capital) {
        this.capital = capital;
    }

    /**
     * Returns the list of equipements.
     */
    public List<Equipement> getEquipements() {
        return equipements;
    }

   
    public String toString() {
        return "Fournisseur{" +
                "numRC=" + numRC +
                ", raisonSocial='" + raisonSocial + '\'' +
                ", adresse='" + adresse + '\'' +
                ", capital=" + capital +
                '}';
    }
}