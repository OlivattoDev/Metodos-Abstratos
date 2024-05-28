package Entities;

public class LegalPerson extends TaxPayers {

	private Integer employeeNumbers;

	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double anualIncome, Integer employeeNumbers) {
		super(name, anualIncome);
		this.employeeNumbers = employeeNumbers;
	}

	public Integer getEmployeeNumbers() {
		return employeeNumbers;
	}

	public void setEmployeeNumbers(Integer employeeNumbers) {
		this.employeeNumbers = employeeNumbers;
	}

	@Override
	public double taxPaid() {
		double taxLegalPerson = (employeeNumbers > 10 ? getAnualIncome() * 0.14 : getAnualIncome() * 0.16);
		return taxLegalPerson;
		
		/* Segundo metodo
		
		if(employeeNumbers > 10) {
			return getAnualIncome() * 0.14;
		}
		else {
			return getAnualIncome() * 0.16;
		}*/
	}
}
