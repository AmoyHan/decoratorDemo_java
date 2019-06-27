package decoratorDemo;

public class Main {
	public static void main(String[] args) {
		/*
		 * 装饰者模式：
		 * 动态的将责任附加到对象上。若要扩展功能，装饰者提供了比继承更具有弹性的方案。
		 * */
		Beverages mocha = new Mocha();
		mocha = new Milk(mocha);
		mocha = new Sugar(mocha);
		System.out.println(mocha.getDescription() + " $" + mocha.cost());
		
		Beverages greenTea = new GreenTea();
		greenTea = new Milk(greenTea);
		greenTea = new Sugar(greenTea);
		System.out.println(greenTea.getDescription() + " $" + greenTea.cost());
	}
}
