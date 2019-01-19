import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class depositotest {

	@Test
	void test1() {
		DepositoCombustible DepositoCombustible = new DepositoCombustible(0, 0);
		boolean resultado = DepositoCombustible.estaLleno();
		assertEquals(true, resultado);
	}
	@Test
	void test2() {
		DepositoCombustible DepositoCombustible = new DepositoCombustible(0, 0);
		boolean resultado = DepositoCombustible.estaVacio();
		assertEquals(false, resultado);
	}
	@Test
	void test3() {
		DepositoCombustible DepositoCombustible = new DepositoCombustible(0, 0);
		boolean resultado = DepositoCombustible.estaLleno();
		assertEquals(0, resultado);
	}
}
