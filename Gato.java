package polimofismo;

public class Gato extends Animal {

	public Gato(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override // -sobrescreve o método principal
	public void emitirSom() {
		System.out.println("O gato está miando.");
	}

}
