package ex1;

import java.util.Date;

// entreprise doit être en majuscule
public class entreprise {

	// encapsulation ( doit etre private et non public)
	public int Siret;
	public String Nom;
	public String adresse;
	public Date date_Creation;
	
	// quand c'est une constance Majuscule séparé d'un underscore
	public static final int capitalMax = 3000000;
	
	//La méthode commence toujours par une minusculepuis maj (camelCase)
	public void Afficher_statut(){
		
	}
	
}
// Ne jamais oublier la javaDocs
