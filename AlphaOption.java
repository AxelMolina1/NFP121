
public class AlphaOption extends Option {

	protected AlphaOption(int valeur) {
		super(Acces.A, "Valeur de alpha", valeur);
	}
	
	@Override
	public String executer() {
		return "" + this.valeur;
	}
	
	@Override
	public String toString() {
		return this.acces.label + " : " + this.valeur;
	}
}
