import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilhaTestFixture {

	private static Pilha pilha;

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		pilha = new Pilha();
		System.out.println("Executou o @BeforeClass");
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		pilha = null;
		System.out.println("Executou o @AfterClass");
	}

	@BeforeEach
	public void setUp() throws Exception {
		Livro livro1 = new Livro("A Terra");
		Livro livro2 = new Livro("A Roda");
		Livro livro3 = new Livro("O Globo");
		Livro livro4 = new Livro("A Lua");
		Livro livro5 = new Livro("O Sol");

		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);
		
		System.out.println("Executou @Before");
	}

	@AfterEach
	public void tearDown() throws Exception {
		int tamanho = pilha.count();
		while (tamanho > 0) {
			pilha.pop();
			tamanho--;
		}
		System.out.println("Executou @After");
	}

	@Test
	public void testNaoAdicionaAlemLimite() {
		pilha.push(new Livro("A Volta ao mundo"));
		Livro livro = pilha.pop();

		assertEquals("O Sol", livro.getTitulo());
		System.out.println("executou testNaoAdicionaAlemLimite()");
	}

	@Test
	public void testNaoAdicionaLivroForaPadraoNome() {
		pilha.pop();
		pilha.push(new Livro("Não Vale"));
		Livro livro = pilha.pop();

		assertEquals("A Lua", livro.getTitulo());
		System.out.println("executou testNaoAdicionaLivroForaPadraoNome()");
	}
}