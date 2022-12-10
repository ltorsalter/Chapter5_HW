
public class test_p44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car7 car1 = new Car7("Car No. 1");
		car1.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Currently processing the execution action of main().");
		}
	}

}

class Car7 extends Thread{
	private String name;
	
	public Car7(String nm) {
		name = nm;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Currently processing the execution action of "+name+".");
		}
	}
}