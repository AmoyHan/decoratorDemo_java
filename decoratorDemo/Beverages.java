package decoratorDemo;

///装饰者与被装饰共同基类，抽象类
public abstract class Beverages {
	
	public String description = "null";
	
	public String getDescription() {
		return this.description;
	}
	
	abstract float cost();
	
}
