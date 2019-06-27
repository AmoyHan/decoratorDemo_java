package decoratorDemo;
///被装饰者
public class Mocha extends Beverages {
	
	public Mocha() {
		this.description = "摩卡咖啡";
	}
	
	@Override
	float cost() {
		return 15.5f;
	}

}
