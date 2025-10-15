package polimofismo;

public class Principal3 {

	public static void main(String[] args) {

		Medico medico = new Medico("Jorge", "Pediatra", 500, "CRM/SP 123456");
		System.out.println("O médico disponível é: " + medico.getNome());
		medico.agendarConsulta();

		System.out.println("---------------------------------");

		Dentista dentista = new Dentista("Ana Paula", "Dentista", 350, "CRO/RJ 654321");
		System.out.println("A dentista disponível é: " + dentista.getNome());
		dentista.agendarConsulta();

		System.out.println("---------------------------------");

		Fisioterapeuta fisioterapeuta = new Fisioterapeuta("Carlos", "Fisioterapeuta de reabilitação", 400,
				"CREFITO/MG 987654");
		System.out.println("O fisioterapeuta disponível é: " + fisioterapeuta.getNome());
		fisioterapeuta.agendarConsulta();

	}

}
