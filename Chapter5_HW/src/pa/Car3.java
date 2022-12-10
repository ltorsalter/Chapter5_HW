package pa;

public class Car3 {
	private int num;
	private double gas;
	
	public Car3() {
		num=0;
		gas=0.0;
		System.out.println("Already produced a car.");
	}
	
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("Set the vehicle number as "+num+", and the gasoline vehicle as "+gas+".");
	}
	
	public void show() {
		System.out.println("The car number is "+num+".");
		System.out.println("Gasoline quantity is "+gas+".");
	}
}
