package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	public double tauxRemuneration;

	public LivretA(double solde, double decouvert, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;

	}

	@Override
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	@Override
	public void debiterMontant(double montant) {
		if (this.solde - montant > 0) {
			this.solde = solde - montant;
		}
	}

	public void AppliquerRemuAnnuelle(){
		if (this.solde > 0) {
			this.solde = solde +( solde*(tauxRemuneration/100));
		}
	}
	
	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
