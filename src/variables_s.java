
public class variables_s {
	
	static String surname="Rohan";
	int Age;
	String Name;

	public static void main(String[] args) {
		variables_s nf= new variables_s();
		//change to the surname affecting the instance as well as the object
		variables_s.surname="Deepak";
		System.out.println(nf.surname);
		System.out.println(variables_s.surname);
	}

}
