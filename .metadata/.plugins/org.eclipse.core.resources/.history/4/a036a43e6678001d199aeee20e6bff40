
public class test_p52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company1 cmp = new Company1();
		
		Driver1 drv1 = new Driver1(cmp);
		drv1.start();
		
		Driver1 drv2 = new Driver1(cmp);
		drv2.start();
	}

}

class Company1{
	private int sum = 0;
	public void add(int a) {
		int tmp = sum;
		System.out.println("The current total amount is $"+tmp+'.');
		System.out.println("Earn $"+a+'.');
		tmp=tmp+a;
		System.out.println("Total amount is $"+tmp+'.');
		sum = tmp;
	}
}
class Driver1 extends Thread{
	private Company1 comp;
	public Driver1(Company1 c) {
		comp=c;
	}
	public void run() {
		for(int i=0;i<3;i++) {
			comp.add(50);
		}
	}
}