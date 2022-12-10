
public class test_p46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car9 car1 = new Car9("Car No. 1");
		car1.start();
		for(int i=0;i<5;i++) {
			System.out.println("Currently processing the execution action of main().");
		}
	}

}

class Car9 extends Thread{
	private String name;
	
	public Car9(String nm) {
		name = nm;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				sleep(1000);
				System.out.println("Currently processing the execution action of "+name+".");
			}
			catch(InterruptedException e) {}
		}
	}
}