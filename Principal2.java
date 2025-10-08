package polimofismo;

public class Principal2 {

	public static void main(String[] args) {

		Horista horista = new Horista(2, "Júlio", "(11)1111111", 12345, "Rua dos bobos");
		System.out.println("O salário de horista é: R$" + horista.calcularSalario(50, 40));

		Jornada jornada = new Jornada(2, "Carlos", "(22)2222222", 12345, "Rua dos bobos");
		System.out.println("O Salário de jornada é: R$" + jornada.calcularSalario(1000, 0));

		ConsultorPj consultorPj = new ConsultorPj(2, "Robert", "(33)3333333", 12345, "Rua dos bobos");
		System.out.println("O salário de consultor PJ é: R$" + consultorPj.calcularSalario(12000, 1000));
	}
}
