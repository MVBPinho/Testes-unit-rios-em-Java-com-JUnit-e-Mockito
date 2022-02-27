
public class Calculadora {

	public int somar(int a, int b) {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return a + b;
	}

	public int dividir(int a, int b) {
		if (b == 0)
			throw new ArithmeticException();

		return a / b;
	}
}