import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.jupiter.api.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class CalculadoraTest {

	@Test
	@Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
	void testSomar() {
		Calculadora calculadora = new Calculadora();

		int resultado = calculadora.somar(4, 6);

		assertEquals(10, resultado);
	}

	@Ignore
	void testSomarSemAnnotation() {
		Calculadora calculadora = new Calculadora();
		int resultadoEsperado = 10;

		int resultado = calculadora.somar(4, 6);

		assertTrue(resultado == resultadoEsperado);
	}

	@Test
	void testSomarNumerosNegativos() {
		Calculadora calculadora = new Calculadora();
		int a = -20;
		int b = -10;
		int resultado = calculadora.somar(a, b);

		assertEquals(-30, resultado);
	}

	@Test
	public void testDividir() {
		Calculadora calculadora = new Calculadora();
		int a = 20;
		int b = 2;

		int resultado = calculadora.dividir(a, b);
		assertEquals(10, resultado);
	}

	@Test
	public void testDividirPorZero() {
		Calculadora calculadora = new Calculadora();
		int a = 20;
		int b = 0;
		Assertions.assertThrows(ArithmeticException.class, () -> {
			calculadora.dividir(a, b);
		}, "testDividirPorZero error was expected");
	}
}
