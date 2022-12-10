
public class test_p30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car5 car1;
		car1 = new Car5();
		
		try {
			car1.setCar(1234, -10.0);
		}
		catch (Car5Exception e) {
			System.out.println(e+" is thrown");
		}
		car1.show();
	}

}

class Car5Exception extends Exception{}

class Car5{
	private int num;
	private double gas;
	
	public Car5() {
		num = 0;
		gas = 0.0;
		System.out.println("Already produced a car.");
	}
	
	public void setCar(int n,double g)throws Car5Exception{
		if(g<0) {
			Car5Exception e = new Car5Exception();
			throw e;
		}else
		{
			num = n;
			gas = g;
			System.out.println("Set the vehicle number as "+num+", and the gasoline vehicle as "+gas+".");
		}
	}
	
	public void show() {
		System.out.println("The car number is "+num+".");
		System.out.println("Gasoline quantity is "+gas+".");
	}
	
}