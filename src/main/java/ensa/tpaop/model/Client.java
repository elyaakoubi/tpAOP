package ensa.tpaop.model;

public class Client {
	private String nom;
	private Compte cp;
	public Compte getCp() {
		return cp;
	}
	public void setCp(Compte cp) {
		this.cp = cp;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void retirer(double mt)
	{
		this.cp.debiter(mt);
	}
	public void verser(double mt)
	{
		this.cp.approvisionner(mt);
	}
	
}
