package decoratorDemo;
///装饰者之一
public class Milk extends DecoratorBeverage {
	private Beverages beverage;
	
	public Milk(Beverages beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + " +牛奶";
	}

	@Override
	float cost() {
		return this.beverage.cost() + 3.1f;
	}

}
