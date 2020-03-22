package ensa.tpaop.model;

public class Compte {
	private double solde=0;
	
	
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public void debiter(double mt)
	{
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.solde-=mt;
	}
	public void approvisionner(double mt)
	{
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.solde+=mt;
	}
	
}
