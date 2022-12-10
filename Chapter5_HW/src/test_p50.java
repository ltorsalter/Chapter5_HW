
public class test_p50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car12 car1 = new Car12("Car No. 1");
		Thread th1 = new Thread(car1);
		th1.start();
		for(int i=0;i<5;i++) {
			System.out.println("Currently processing the execution action of main().");
		}
	}

}

class Car12 implements Runnable{
	private String name;
	
	public Car12(String nm) {
		name=nm;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Currently processing the execution action of "+name+".");
		}
	}
}