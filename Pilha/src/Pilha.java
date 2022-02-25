import java.util.ArrayList;

public class Pilha {

	int limite = 5;
	ArrayList<Livro> pilha = new ArrayList<Livro>();

	public void push(Livro livro) {
		if (pilha.size() >= limite)
			return;

		if (!livro.getTitulo().startsWith("A") && !livro.getTitulo().startsWith("O"))
			return;

		pilha.add(livro);
	}

	public Livro pop() {
		return pilha.get(pilha.size() - 1);
	}

	public int count() {
		return pilha.size();
	}
}