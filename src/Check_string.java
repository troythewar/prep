import java.io.*;
import java.util.*;


public class Check_string {

	String s;
	String k,t;
	
	void GetData(){
		try
		{
		BufferedReader readers=new BufferedReader(new FileReader("D:\\camera.txt"));
		
		while(readers.ready())
		{
			
			s=readers.readLine();
			if(s!=null)
			{
			if(s.startsWith("#")||s.startsWith("@"))
			{
				continue;
			}
			/*else if(s.startsWith("\n")) 
			{
				continue;
			}*/
			else{
				System.out.println(s);
			}
			}
			//Scanner sc =new Scanner(s);
			//sc.skip("##");
			//System.out.println(sc.nextLine());
			//k=readers.skip(s);
			//k=s.trim().startsWith("#");
			
			//continue;
			//System.out.println(s);
			
		}
		}catch(Exception e){
			e.printStackTrace();
			}
	}
	public static void main(String[] args) {
		Check_string cs=new Check_string();
		cs.GetData();
		
	}

}
