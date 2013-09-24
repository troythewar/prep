import java.io.*;
public class Array_dime {

	int ArraySize,pointerPosition,Steps;
	int rt,lt,delrt,dellt;
	int moves;
	void TakingValue(){
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		try
		{
		System.out.println("Enter the Value of array Size: ");
		ArraySize=Integer.parseInt(br.readLine());
		int[] Arraytest=new int[ArraySize];
		//System.out.println(Arraytest.length);
		
		System.out.println("Enter the Value of the pointer of array: ");
		pointerPosition=Integer.parseInt(br.readLine());
		//Getting the values of rt and lt
		rt=Arraytest.length-pointerPosition;
		lt=pointerPosition-1;
		/*
		System.out.println("The value of rt " +rt);
		System.out.println("The value of lt " +lt);
		*/
		
		System.out.println("Enter the number of steps to move: ");
		Steps=Integer.parseInt(br.readLine());
		
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
		void StepSizeCalculation(){
			
			System.out.println("The value of rt " +rt);
			System.out.println("The value of lt " +lt);
			
			if((lt>=Steps)&&(rt>=Steps)){
				moves=Steps*2;
				System.out.println("The total moves available for the steps: "+moves);
			}
			else if((lt>=Steps)&&(rt<Steps)){
				delrt=Steps-rt;
				moves=(Steps*2)-delrt;//Calculate Value
				System.out.println("The total moves available for the steps: "+moves);
			}
			else if((lt<Steps)&&(rt>=Steps)){
				dellt=Steps-lt;
				moves=(Steps*2)-dellt;//Calculate values
				System.out.println("The total moves available for the steps: "+moves);
			}
			else if((lt<Steps)&&(rt<Steps)){
				moves=(Steps*2)-delrt-dellt;
				System.out.println("The total moves available for the steps: "+moves);
			}
		
	}
	
	public static void main(String[] args) {
		//Enter the Value of the Array
		Array_dime ad=new Array_dime();
		ad.TakingValue();
		ad.StepSizeCalculation();
		
	}

}
