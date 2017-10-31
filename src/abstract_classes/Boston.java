package abstract_classes;

public class Boston extends City{

	public Boston(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return this.getPopulation() * this.getGrowthRate() + .50 * this.getPopulation();
	}

	
	
}
