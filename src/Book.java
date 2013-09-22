
public class Book {
	
	String color;
	String Manufactured;
	boolean enginestate;
	
	void EngineState()
	{
		if (enginestate==true)
			System.out.println("The engine is on state");
		else
			{
			enginestate=true;
			System.out.println("The engine is on now");
			}
	}
	
	void showAttr()
	{
		System.out.println("The vehicle made from " +Manufactured+ " Color of the vehicle is "+color);
		if(enginestate==true)
			System.out.println("ON");
		else
			System.out.println("OFF");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instantiate
		Book m =new Book();
		System.out.println("--------Print Status1---------");
		m.Manufactured="HONDA";
		m.color="RED";
		m.showAttr();
		System.out.println("--------Print Status2---------");
		m.EngineState();
		m.showAttr();
		System.out.println("--------Engine state off---------");
		m.enginestate=false;
		System.out.println("--------Status3---------");
		m.showAttr();

	}

}
