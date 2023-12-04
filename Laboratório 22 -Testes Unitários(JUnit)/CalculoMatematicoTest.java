import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculoMatematicoTest {
	
	private static CalculoMatematico calc;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calc = new CalculoMatematico();
	}

	@Test
	void testCalcularFatorialZero() {
		assertEquals(1, calc.calcularFatorial(0));
	}

	@Test
	void testCalcularFatorialUm() {
		assertEquals(1, calc.calcularFatorial(1));
	}
	
	@Test
	void testCalcularFatorialPositivo() {
		assertEquals(120, calc.calcularFatorial(5));
	}
	
	@Test
	void testCalcularFatorialNegativo() {
		assertThrows(IllegalArgumentException.class, () -> {
			calc.calcularFatorial(-2);
		});
	}
	
}
