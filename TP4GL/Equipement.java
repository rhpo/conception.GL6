package TP4GL;


public class Equipement {
    private int numSerie;
    private String designation;
    private double prix;
    private Fournisseur fournisseur;
    private Atelier affecte;
    private TypeEquipement type;

    public Equipement(int numSerie, String designation, double prix, TypeEquipement type) {
        this.numSerie = numSerie;
        this.designation = designation;
        this.prix = prix;
        this.type = type;
    }

    public void ajouterFournisseur(Fournisseur f) {
        this.fournisseur = f;
        if (f != null) f.ajouterEquipement(this);
    }

    /**
     * Removes the specified fournisseur if it matches the current fournisseur.
     */
    public void supprimerFournisseur(Fournisseur f) {
        if (this.fournisseur == f) {
            this.fournisseur = null;
            f.supprimerEquipement(this);
        }
    }

  
    /**
     * Returns the value of numSerie.
     */
    public int getNumSerie() { return numSerie; }
    /**
     * Returns the designation.
     */
    public String getDesignation() { return designation; }
    /**
     * Returns the price.
     */
    public double getPrix() { return prix; }
    /**
     * Returns the fournisseur.
     */
    public Fournisseur getFournisseur() { return fournisseur; }
    /**
     * Returns the Atelier instance associated with this object.
     */
    public Atelier getAffecte() { return affecte; }
    public TypeEquipement getType() { return type; }

    /**
     * Sets the fournisseur.
     */
    public void setFournisseur(Fournisseur fournisseur) { this.fournisseur = fournisseur; }
    public void setAffecte(Atelier affecte) { this.affecte = affecte; }

   
    /**
     * Returns a string representation of the Equipement object.
     */
    public String toString() {
        return "Equipement{" +
                "numSerie=" + numSerie +
                ", designation='" + designation + '\'' +
                ", prix=" + prix +
                ", type=" + type +
                '}';
    }
}
