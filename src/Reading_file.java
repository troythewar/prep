import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reading_file {
	String pattern = "\\[([^\\]]+)+:+/]";
	String lines;

	void ReadFile(){
		try
		{
		BufferedReader br = new BufferedReader(new FileReader("D:\\camera.txt"));
		//int data=br.read();
		
		
		while(br.ready())
			{
			lines=br.readLine();
			Pattern r=Pattern.compile(pattern);
			Matcher m=r.matcher(lines);
			while(m.find())
				{
				System.out.print(lines);
				}
			}
		
		
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reading_file read_log=new Reading_file();
		read_log.ReadFile();
	}

}
