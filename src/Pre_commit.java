import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Pre_commit {

	public static void main(String[] args) {
		
		String S=args[0];
		String T=args[1];
		PrintStream out = null;
		try {
			out = new PrintStream(new FileOutputStream("D:/output.txt"));
			out.print(S+"::"+T);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setOut(out);
	}

}
