package TP4GL;

import java.util.ArrayList;
import java.util.List;

public class Technicien {
    private int matricule;
    private Specialite specialite;
    private Technicien chefEquipe;
    private List<Technicien> membres;
    private Vehicule vehicule;

    public Technicien(int matricule, Specialite specialite) {
        this.matricule = matricule;
        this.specialite = specialite;
        this.membres = new ArrayList<>();
    }

    public void designerChefEquipe(Technicien nouveauChef) {
        this.chefEquipe = nouveauChef;

        if (nouveauChef != null) {
            nouveauChef.ajouterMembre(this);
            if (this.membres.contains(nouveauChef)) {
                this.membres.remove(nouveauChef);
            }
        }
    }

    public void ajouterMembre(Technicien t) {
        if (t != null && !membres.contains(t)) {
            membres.add(t);
            t.chefEquipe = this;
        }
    }

    public void ajouterVehicule(Vehicule v) {
        this.vehicule = v;
        if (v != null && v.getConducteur() != this) {
            v.setConducteur(this);
        }
    }

    public int getMatricule() { return matricule; }
    public Specialite getSpecialite() { return specialite; }
    public Technicien getChefEquipe() { return chefEquipe; }
    public Vehicule getVehicule() { return vehicule; }
    public List<Technicien> getMembres() { return membres; }

    @Override
    public String toString() {
        return "Technicien{" +
                "matricule=" + matricule +
                ", specialite=" + specialite +
                '}';
    }
}
