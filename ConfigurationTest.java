import static org.junit.Assert.*;

import org.junit.Test;

public class ConfigurationTest {
	
	Configuration configuration;

	@Test
	public void testConfiguration() {
		Configuration configuration = CLIClassique.configuration("-K 10 -A 0.90 -K 20 -P -K 30 -C".split(" "));
		assertEquals(configuration.toString(), "alpha=0.9, epsilon=-1.0, indice=30, mode=CREUSE");
	}

}
