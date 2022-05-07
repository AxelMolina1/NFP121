
public class CreuseOption extends Option {

	protected CreuseOption() {
		super(Acces.C, "Mode matrice creuse");
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
