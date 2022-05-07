
public enum Acces {

	A("Alpha"),
	K("Indice"),
	E("Precision"),
	P("Matrice Pleine"),
	C("Matrice Creuse");
	
	public final String label;
	
	private Acces(String label) {
		this.label = label;
	}
	
	@Override
	public String toString() {
		return this.label;
	}
}
