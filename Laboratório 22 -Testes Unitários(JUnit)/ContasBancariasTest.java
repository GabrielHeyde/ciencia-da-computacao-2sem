import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ContasBancariasTest {
	
	private static ContasBancarias conta;
	private static ContasBancarias conta1;
	private static ContasBancarias conta2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		conta = new ContasBancarias("123456789", 5000, "real");
		conta1 = new ContasBancarias("987654321", 3000, "dólar");
		conta2 = new ContasBancarias("246813579", 1000, "real");
	}

	@Test
	void testTransferenciaSemSaldo() {
		assertThrows(IllegalArgumentException.class, () -> {
			conta2.transferencia(conta2, 10000, conta);
		});
	}

	@Test
	void testTransferenciaMoedasDiferentes() {
		assertThrows(IllegalArgumentException.class, () -> {
			conta.transferencia(conta, 5000, conta1);
		});
	}
	
	@Test
	void testTransferenciaCorreta() {
		assertEquals(true, conta.transferencia(conta, 2000, conta2));
	}

	@Test
	void testSaqueCorreto() {
		assertEquals(true, conta.sacar(conta, 500));
	}
	
	@Test
	void testSaqueSemSaldo() {
		assertThrows(IllegalArgumentException.class, () -> {
			conta2.sacar(conta2, 2000);
		});
	}
	
}
