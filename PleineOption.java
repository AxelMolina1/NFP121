
public class PleineOption extends Option {

	protected PleineOption() {
		super(Acces.A, "Mode matrice pleine");
	}
	
	@Override
	public String executer() {
		return "" + this.valeur;
	}
	
	@Override
	public String toString() {
		return "" + this.acces.label;
	}
}
