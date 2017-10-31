package abstract_classes;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return this.getGrowthRate() * this.getPopulation() + 1_000_000;
	}

}
