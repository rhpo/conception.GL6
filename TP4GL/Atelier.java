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

    /**
     * Removes the specified Equipement from the collection and unsets its affecte property.
     */
    public void supprimerEquipement(Equipement e) {
        if (equipements.remove(e)) {
            e.setAffecte(null);
        }
    }

 
    /**
     * Returns the value of numAtelier.
     */
    public int getNumAtelier() { return numAtelier; }
    /**
     * Returns the entree date.
     */
    public Date getEntree() { return entree; }
    public Date getSortie() { return sortie; }
    /**
     * Returns the list of equipements.
     */
    public List<Equipement> getEquipements() { return equipements; }

    
    /**
     * Returns a string representation of the Atelier object.
     */
    public String toString() {
        return "Atelier{" +
                "numAtelier=" + numAtelier +
                ", entree=" + entree +
                ", sortie=" + sortie +
                '}';
    }
}