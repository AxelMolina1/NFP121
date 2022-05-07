
public class IndiceOption extends Option {

	protected IndiceOption(int valeur) {
		super(Acces.K, "Valeur de l'indice", valeur);
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
