package polimofismo;

public class Lobo extends Animal {

	public Lobo(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override // -sobrescreve o método principal
	public void emitirSom() {
		System.out.println("O lobo está uivando.");
	}

}
