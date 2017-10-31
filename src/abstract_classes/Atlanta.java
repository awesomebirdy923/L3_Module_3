package abstract_classes;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return (this.getGrowthRate() * 2) * this.getGrowthRate() * this.getPopulation();
	}

}
