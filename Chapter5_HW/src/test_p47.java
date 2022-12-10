
public class test_p47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car10 car1 = new Car10("Car No. 1");
		car1.start();
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Currently processing the execution action of main().");
			}
			catch(InterruptedException e) {}
		}
	}

}

class Car10 extends Thread{
	private String name;
	
	public Car10(String nm) {
		name = nm;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
				System.out.println("Currently processing the execution action of "+name+".");
		}
	}
}