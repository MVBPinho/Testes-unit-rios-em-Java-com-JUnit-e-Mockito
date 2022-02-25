public class PilhaMain {

	public static void main(String[] args) {
		PilhaTest teste = new PilhaTest();
		boolean resultado;
		
		resultado = teste.testNaoAdicionaLivroAlemLimite();
		System.out.println("testNaoAdicionaLivroAlemLimite: " + resultado);
		
		resultado = teste.testRetiraUltimoLivro();
		System.out.println("testRetiraUltimoLivro: " + resultado);
		
		resultado = teste.testNaoAdicionarLivroForaPadraoNome();
		System.out.println("testNaoAdicionarLivroForaPadraoNome: " + resultado);
	}
}