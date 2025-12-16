package TP4GL;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Atelier {
    private int numAtelier;
    private Date entree;
    private Date sortie;
    private List<Equipement> equipements;

    public Atelier(int numAtelier, Date entree, Date sortie) {
        this.numAtelier = numAtelier;
        this.entree = entree;
        this.sortie = sortie;
        this.equipements = new ArrayList<>();
    }

    public void ajouterEquipement(Equipement e) {
        if (e != null && !equipements.contains(e)) {
            equipements.add(e);
            e.setAffecte(this);
        }
    }

    public void supprimerEquipement(Equipement e) {
        if (equipements.remove(e)) {
            e.setAffecte(null);
        }
    }

 
    public int getNumAtelier() { return numAtelier; }
    public Date getEntree() { return entree; }
    public Date getSortie() { return sortie; }
    public List<Equipement> getEquipements() { return equipements; }

    
    public String toString() {
        return "Atelier{" +
                "numAtelier=" + numAtelier +
                ", entree=" + entree +
                ", sortie=" + sortie +
                '}';
    }
}