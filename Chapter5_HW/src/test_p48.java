
public class test_p48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car11 car1 = new Car11("Car No. 1");
		car1.start();
		try {
			car1.join();
		}
		catch(InterruptedException e) {}
		System.out.println("End the processing work of main().");
	}

}

class Car11 extends Thread{
	private String name;
	
	public Car11(String nm) {
		name = nm;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
				System.out.println("Currently processing the execution action of "+name+".");	
		}
	}
}