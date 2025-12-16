package TP4GL;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reparation {
    private Date dateReparation;
    private int nbHeure;
    private String travaux;

    private List<String> pieces; 

    public Reparation(Date dateReparation, int nbHeure, String travaux) {
        this.dateReparation = dateReparation;
        this.nbHeure = nbHeure;
        this.travaux = travaux;
        this.pieces = new ArrayList<>();
    }

    public double calculerMontantReparation() {
        return nbHeure * 100.0; 
    }

    public boolean estReformable() {
        return nbHeure > 100;
    }

    public void ajouterPiece(String piece) {
        pieces.add(piece);
    }

    public void supprimerPiece(String piece) {
        pieces.remove(piece);
    }

    public void afficherListePieces() {
        for (String p : pieces) {
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return "Reparation{" +
                "dateReparation=" + dateReparation +
                ", nbHeure=" + nbHeure +
                ", travaux='" + travaux + '\'' +
                '}';
    }
}
