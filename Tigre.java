package polimofismo;

public class Tigre extends Animal {

	public Tigre(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override // -sobrescreve o método principal
	public void emitirSom() {
		System.out.println("O tigre está roncando.");
	}

}
