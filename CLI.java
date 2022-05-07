import java.util.ArrayList;
import java.util.List;

public class CLI {
	
	List<Option> options;
	
	public CLI() {
		options = new ArrayList<>();
	}
	
	public void addOption(Option option) {
		options.add(option);
	}
	
	public boolean analyzeOption(Option option) {
		return options.contains(option);
	}
	
	public static void main(String[] args) {
		CLI cli = new CLI();
		IndiceOption indice = new IndiceOption(10);
		AlphaOption alpha = new AlphaOption(10);
		PrecisionOption precision = new PrecisionOption(10);
		PleineOption pleine = new PleineOption();
		CreuseOption creuse = new CreuseOption();
		cli.addOption(indice);
		cli.addOption(alpha);
		cli.addOption(precision);
		cli.addOption(pleine);
		cli.addOption(creuse);
	}

}
