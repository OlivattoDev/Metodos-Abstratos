package Entities;

public class PhysicalPerson extends TaxPayers {

	private Double healthExpenditures;

	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double taxPaid() {
		double taxPhysicalPerson = (getAnualIncome() < 20000.0 ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25);
		taxPhysicalPerson -= getHealthExpenditures() * 0.50;
		taxPhysicalPerson = (taxPhysicalPerson < 0.0 ? taxPhysicalPerson = 0.0 : taxPhysicalPerson);	
 		return taxPhysicalPerson;
		
 		/* Segundo metodo
 		 
 		double taxPhysicalPerson;
 		if(getAnualIncome() < 20000.0) {
 			taxPhysicalPerson = getAnualIncome() * 0.15;
 		}
 		else {
 			taxPhysicalPerson = getAnualIncome() * 0.25;
 		}
 		taxPhysicalPerson -= getHealthExpenditures() * 0.50;
 		if(taxPhysicalPerson < 0.0) {
 			taxPhysicalPerson = 0.0;
 		}
 		return taxPhysicalPerson;*/
	}
}
