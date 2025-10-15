package polimofismo;

public class Fisioterapeuta extends ProfissionalSaude {

	private String crefito;

	public Fisioterapeuta(String nome, String especialidade, int valorConsulta, String crefito) {
		super(nome, especialidade, valorConsulta);
		this.crefito = crefito;
	}

	@Override
	public void agendarConsulta() {
		System.out.println("Em breve entraremos em contato!");
	}

}
