
public class string_work {

	public static void main(String[] args) {
		String s2,Rohan="Deepak";
		s2=Rohan;
		
		System.out.println("Same Object?" + (s2==Rohan));
		s2=new String(Rohan);
		//s2=String.valueOf(Rohan);
		System.out.println("========================");
		System.out.println("Same obj??" + (s2==Rohan));
		
		System.out.println("New way"+"========"+(String.valueOf(s2)==Rohan));
		String deep=s2.getClass().getName();
		System.out.println("=======================>"+deep);
	}

}
