package polimofismo;

public class Medico extends ProfissionalSaude {

	private String crm;

	public Medico(String nome, String especialidade, int valorConsulta, String crm) {
		super(nome, especialidade, valorConsulta);
		this.crm = crm;
	}

	@Override
	public void agendarConsulta() {
		System.out.println("A consulta está agendada para o dia 13/11/2025!");
	}

}
