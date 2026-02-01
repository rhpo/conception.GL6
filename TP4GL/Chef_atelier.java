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


	/**
	 * Returns the number of experience.
	 */
	public int getNbExperience() {
		return NbExperience;
	}
	public void setNbExperience(int nbExperience) {
		NbExperience = nbExperience;
	}
	/** Returns the DateExperience. */
	public Date getDateExperience() {
		return DateExperience;
	}
	/**
	 * Sets the date of experience.
	 */
	public void setDateExperience(Date dateExperience) {
		DateExperience = dateExperience;
	}
	/** Returns the date of the promotion. */
	public Date getDatePromotion() {
		return DatePromotion;
	}
	/**
	 * Sets the date for the promotion.
	 */
	public void setDatePromotion(Date datePromotion) {
		DatePromotion = datePromotion;
	}
	public Status getStatus() {
		return status;
	}
	/**
	 * Sets the status.
	 */
	public void setStatus(Status status) {
		this.status = status;
	}


	
	public String toString() {
		return "Chef d’Atelier {" +  super.toString() + ", NbExpérience: " + NbExperience + ", DateExpérience: " + DateExperience +  ", DatePromotion: " + DatePromotion +  ", Statut: " + status +"}";
	}
	
	/**
	 * Displays the string representation of the object.
	 */
	public void afficher() {
		System.out.println(this.toString());
	}
	
	/**
	 * Returns the singleton instance of Chef_atelier.
	 */
	public static Chef_atelier getInstance(String nom, String prenom) {
		if (instance == null) {
		instance = new Chef_atelier(nom, prenom);
		}
		return instance;
		}
	
	/**
	 * Calculates the number of years of experience based on the given expiration date.
	 */
	public int miseajourexp (Date dateexp) {
		Date curr = new Date();
		long diff = curr.getTime() - dateexp.getTime();	
		int years = (int)(diff / (1000L * 60 * 60 * 24 * 365));
		this.NbExperience = years;
		return years;
	}
}

	
