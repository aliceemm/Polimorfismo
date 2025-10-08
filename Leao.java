package polimofismo;

public class Leao extends Animal {

	public Leao(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override // -sobrescreve o método de uma Superclasse ou Interface
	public void emitirSom() {
		System.out.println("O leão está rugindo.");
	}

}
