import java.io.PrintStream;


public class Array_check {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sam[]=new String[10];
		int len=sam.length;
		try
		{
		sam[10]="Rohan";
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Array out of bounds");
		}

	}

}
