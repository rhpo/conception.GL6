package TP4GL;
import java.util.Date;

public class Chef_atelier extends personne{

	private int NbExperience;
	private Date DateExperience;
	private Date DatePromotion;
	private Status status;
	private Specialite specialte;
	private static Chef_atelier instance;
	
	
	public Chef_atelier(int nbExperience, Date dateExperience, Date datePromotion, Status status,int matricule, Specialite specialte, String nom, String prenom, String email, String login, String password) {
		super(nom, prenom, email, login, password);
		NbExperience = nbExperience;
		DateExperience = dateExperience;
		DatePromotion = datePromotion;
		this.status= status;
	}
	
	
	public Chef_atelier() {

	}

	
	private Chef_atelier(String nom, String prenom) {
		super(nom , prenom);
	}


	public int getNbExperience() {
		return NbExperience;
	}
	public void setNbExperience(int nbExperience) {
		NbExperience = nbExperience;
	}
	public Date getDateExperience() {
		return DateExperience;
	}
	public void setDateExperience(Date dateExperience) {
		DateExperience = dateExperience;
	}
	public Date getDatePromotion() {
		return DatePromotion;
	}
	public void setDatePromotion(Date datePromotion) {
		DatePromotion = datePromotion;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}


	
	public String toString() {
		return "Chef d’Atelier {" +  super.toString() + ", NbExpérience: " + NbExperience + ", DateExpérience: " + DateExperience +  ", DatePromotion: " + DatePromotion +  ", Statut: " + status +"}";
	}
	
	public void afficher() {
		System.out.println(this.toString());
	}
	
	public static Chef_atelier getInstance(String nom, String prenom) {
		if (instance == null) {
		instance = new Chef_atelier(nom, prenom);
		}
		return instance;
		}
	
	public int miseajourexp (Date dateexp) {
		Date curr = new Date();
		long diff = curr.getTime() - dateexp.getTime();	
		int years = (int)(diff / (1000L * 60 * 60 * 24 * 365));
		this.NbExperience = years;
		return years;
	}
}

	
