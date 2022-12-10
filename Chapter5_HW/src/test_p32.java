
public class test_p32 {

	public static void main(String[] args)throws Car6Exception {
		// TODO Auto-generated method stub
		Car6 car1;
		car1 = new Car6();
		
		car1.setCar(1234, -10.0);
		car1.show();
	}

}

class Car6Exception extends Exception{}

class Car6{
	private int num;
	private double gas;
	
	public Car6() {
		num = 0;
		gas = 0.0;
		System.out.println("Already produced a car.");
	}
	
	public void setCar(int n,double g)throws Car6Exception{
		if(g<0) {
			Car6Exception e = new Car6Exception();
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