package decoratorDemo;
///被装饰者
public class GreenTea extends Beverages {
	
	public GreenTea() {
		this.description = "绿茶";
	}
	
	@Override
	float cost() {
		return 11.3f;
	}

}
