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

    public void supprimerEquipement(Equipement e) {
        if (e != null && equipements.remove(e)) {
            e.setFournisseur(null);
        }
    }


    public int getNumRC() {
        return numRC;
    }

    public void setNumRC(int numRC) {
        this.numRC = numRC;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

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