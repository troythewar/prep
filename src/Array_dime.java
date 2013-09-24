import java.io.*;
public class Array_dime {

	int ArraySize,pointerPosition,Steps;
	void TakingValue(){
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		try
		{
		System.out.println("Enter the Value of array Size: ");
		ArraySize=Integer.parseInt(br.readLine());
		int[] Arraytest=new int[ArraySize];
		System.out.println(Arraytest.length);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//Enter the Value of the Array
		Array_dime ad=new Array_dime();
		ad.TakingValue();
		
	}

}
