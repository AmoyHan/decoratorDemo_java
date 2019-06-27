package decoratorDemo;
///装饰者之一
public class Sugar extends DecoratorBeverage {
	
	private Beverages beverage;
	
	public Sugar(Beverages beverages) {
		this.beverage = beverages;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + " +糖";
	}

	@Override
	float cost() {
		return this.beverage.cost() + 2.3f;
	}

}
