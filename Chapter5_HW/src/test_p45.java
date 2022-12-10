
public class test_p45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car8 car1 = new Car8("Car No. 1");
		car1.start();
		Car8 car2 = new Car8("Car No. 2");
		car2.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Currently processing the execution action of main().");
		}
	}

}

class Car8 extends Thread{
	private String name;
	
	public Car8(String nm) {
		name = nm;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Currently processing the execution action of "+name+".");
		}
	}
}