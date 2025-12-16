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

    public void supprimerFournisseur(Fournisseur f) {
        if (this.fournisseur == f) {
            this.fournisseur = null;
            f.supprimerEquipement(this);
        }
    }

  
    public int getNumSerie() { return numSerie; }
    public String getDesignation() { return designation; }
    public double getPrix() { return prix; }
    public Fournisseur getFournisseur() { return fournisseur; }
    public Atelier getAffecte() { return affecte; }
    public TypeEquipement getType() { return type; }

    public void setFournisseur(Fournisseur fournisseur) { this.fournisseur = fournisseur; }
    public void setAffecte(Atelier affecte) { this.affecte = affecte; }

   
    public String toString() {
        return "Equipement{" +
                "numSerie=" + numSerie +
                ", designation='" + designation + '\'' +
                ", prix=" + prix +
                ", type=" + type +
                '}';
    }
}
