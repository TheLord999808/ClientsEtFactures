package metier;

import java.time.LocalDate;

public class Facture
{
	private LocalDate date;
	private int montant;
	private boolean reglementfacture;
	private Client client;
	
	public Facture() {}
	
	public Facture(Client client) 
	{
		this.client = client;
		this.date = date;
		this.montant = montant;
		this.reglementfacture = reglementfacture;
	}
	
	
	
	
	
	
	
	
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	
	public Client getClient()
	{
		return this.client;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return this.montant;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee()
	{
		return this.reglementfacture = true;
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		return this.date;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
		;
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		return new facture(this.date,this.client,this.montant,this.reglementfacture);
	}
}