
public class PrecisionOption extends Option {

	protected PrecisionOption(int valeur) {
		super(Acces.E, "Valeur de precision", valeur);
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
