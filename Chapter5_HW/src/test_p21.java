
public class test_p21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] test;
			test = new int[5];
			
			System.out.println("Assign the value to test[10].");
			
			test[10] = 80;
			System.out.println("Assign 80 to test[10].");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exceeded the range of the array.");
		}
		
		System.out.println("Successfully completed!");
	}

}
