package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PessoaFisica;
import entities.PessoaJuridica;
import entities.TaxaImposto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxaImposto> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int contribuinte = sc.nextInt();
		
		for (int i=1; i<=contribuinte; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)?");
			char origem = sc.next().charAt(0);
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			
			if(origem == 'i') {
				System.out.print("Health expenditures: ");
				double gastoSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, gastoSaude));	
			}else if (origem == 'c') {
				System.out.print("Number of employees: ");
				int totalFuncionario = sc.nextInt();
				list.add(new PessoaJuridica(name, rendaAnual, totalFuncionario));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for (TaxaImposto imp : list) {
			System.out.println(imp.getNome() + ": $ " + String.format("%.2f", imp.imposto()));
		}
		
		double sum = 0.0;
		for (TaxaImposto imp : list) {
			sum += imp.imposto();
		}
		System.out.println("TOTAL TAXES: " + String.format("%.2f", sum));
		
		
		sc.close();

	}

}
