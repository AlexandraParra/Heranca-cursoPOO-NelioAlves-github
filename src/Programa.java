import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;
import entidade.Terceirizado;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Número de funcionários: ");
		int n = sc.nextInt();
		List <Funcionario> funcionarios = new ArrayList<>();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados do funcionário #"+i+":");
			System.out.print("É terceirizado (s/n)?");
			char terc = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			if (terc == 's') {
				System.out.print("Despesa adicional: ");
				double despesa = sc.nextDouble();
				Funcionario funcionario = new Terceirizado(nome, horas, valorHora, despesa);
				funcionarios.add(funcionario);
			} else {	
				Funcionario funcionario = new Funcionario(nome, horas, valorHora);
				funcionarios.add(funcionario);
			}
		}
		
		System.out.println();
		System.out.println("Pagamentos:");
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
		sc.close();

	}

}
