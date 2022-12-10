
public class test_p55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company2 cmp = new Company2();
		
		Driver2 drv1 = new Driver2(cmp);
		drv1.start();
		
		Driver2 drv2 = new Driver2(cmp);
		drv2.start();
	}

}

class Company2{
	private int sum = 0;
	public synchronized void add(int a) {
		int tmp = sum;
		System.out.println("The current total amount is $"+tmp+'.');
		System.out.println("Earn $"+a+'.');
		tmp=tmp+a;
		System.out.println("Total amount is $"+tmp+'.');
		sum = tmp;
	}
}
class Driver2 extends Thread{
	private Company2 comp;
	public Driver2(Company2 c) {
		comp=c;
	}
	public void run() {
		for(int i=0;i<3;i++) {
			comp.add(50);
		}
	}
}