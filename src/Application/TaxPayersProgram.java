package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.LegalPerson;
import Entities.PhysicalPerson;
import Entities.TaxPayers;

public class TaxPayersProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayers> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Physical person or Legal person (p/l) ? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (type == 'p') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new PhysicalPerson(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int employeeNumbers = sc.nextInt();
				list.add(new LegalPerson(name, anualIncome, employeeNumbers));
			}
		}

		System.out.println();
		System.out.println("Taxes paid: ");
		for (TaxPayers tax : list) {
			System.out.println(tax.getName() + " $ " + String.format("%.2f", tax.taxPaid()));
		}

		System.out.println();
		double sum = 0.0;
		for (TaxPayers tax : list) {
			sum += tax.taxPaid();
		}

		System.out.println("Total Taxes: $ " + String.format("%.2f", sum));

		sc.close();
	}
}
