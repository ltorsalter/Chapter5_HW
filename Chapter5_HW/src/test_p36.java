import java.io.*;

public class test_p36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
			String str1 = br.readLine();
			String str2 = br.readLine();
			System.out.println("The two strings written to the file are");
			System.out.println(str1);
			System.out.println(str2);
			br.close();
		}
		catch(IOException e) {
			System.out.println("I/O error.");
		}
	}

}