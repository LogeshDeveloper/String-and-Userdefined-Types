package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader obj = new InputStreamReader(System.in);
		BufferedReader obj2 = new BufferedReader(obj);
		System.out.println("enter reg. no");
		String reg = obj2.readLine();
		float value = Float.parseFloat(reg);
		System.out.println(value);
		String name = obj2.readLine();
		System.out.println("Enter the Name");
		String age = obj2.readLine();
		System.out.println("Enter the name of the Student");
		System.out.println("my name is "+name);
		System.out.println("The age is"+age );
		obj.close();
		obj2.close();
		
	}

}
