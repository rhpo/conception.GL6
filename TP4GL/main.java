package TP4GL;
import java.util.Date;

public class main {
    public static void main(String[] args) {

        Fournisseur f1 = new Fournisseur(101, "IT", "Alger", 250000);

        Equipement e1 = new Equipement(5001, "Ordinateur Asus", 90000, TypeEquipement.Micro);
        Equipement e2 = new Equipement(5002, "Imprimante Canon", 40000, TypeEquipement.Imprimante);

        f1.ajouterEquipement(e1);
        f1.ajouterEquipement(e2);

        Atelier a1 = new Atelier(1, new Date(), new Date());
        a1.ajouterEquipement(e1);
        a1.ajouterEquipement(e2);

        Technicien chef = new Technicien(1001, Specialite.Informatique);
        Technicien t2 = new Technicien(1002, Specialite.Electronique);
        t2.designerChefEquipe(chef);

        Vehicule v1 = new Vehicule(2001, "Dacia");
        chef.ajouterVehicule(v1);

        Reparation r1 = new Reparation(new Date(), 12, "Remplacement carte mère");
        r1.ajouterPiece("Carte mère");
        r1.ajouterPiece("RAM 16GB");

        System.out.println("Fournisseur :");
        System.out.println(f1);
        for (Equipement e : f1.getEquipements()) {
            System.out.println("  " + e);
        }

        System.out.println("\nAtelier :");
        System.out.println(a1);

        System.out.println("\nTechniciens :");
        System.out.println("Chef: " + chef);
        System.out.println("Membre: " + t2);

        System.out.println("\nVehicule :");
        System.out.println(v1 + " | Conducteur: " + v1.getConducteur());

        System.out.println("\nReparation :");
        System.out.println(r1);
        System.out.println("Montant total estime: " + r1.calculerMontantReparation() + " DA");
        System.out.println("Reformable ? " + (r1.estReformable() ? "Oui" : "Non"));
        System.out.println("Liste des pieces : ");
        r1.afficherListePieces();
    }


}
