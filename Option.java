
public abstract class Option {

	protected Acces acces;
	private String description;
	protected int valeur;
	
	protected Option(Acces acces, String description, int valeur) {
		this.acces = acces;
		this.description = description;
		this.valeur = valeur;
	}
	
	protected Option(Acces access, String description) {
		this.acces = access;
		this.description = description;
	}
	
	public abstract String executer();

	public Acces getAccess() {
		return this.acces;
	}

	public void setAccess(Acces acces) {
		this.acces = acces;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getValeur() {
		return this.valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
	
}
