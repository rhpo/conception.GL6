package TP4GL;
class Piece {
    private int ref;
    private String nom;
    private int quantite;
    private double prix;

    public Piece(int ref, String nom, int quantite, double prix) {
        this.ref = ref;
        this.nom = nom;
        this.quantite = quantite;
        this.prix = prix;
    }

    public int getRef() { return ref; }
    public void setRef(int ref) { this.ref = ref; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public int getQuantite() { return quantite; }
    public void setQuantite(int quantite) { this.quantite = quantite; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }

    public void entrerStock(int qte) {
        this.quantite += qte;
    }

    public double calculerMontantPiece() {
        return this.quantite * this.prix;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "ref=" + ref +
                ", nom='" + nom + '\'' +
                ", quantite=" + quantite +
                ", prix=" + prix +
                '}';
    }
}
