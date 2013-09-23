import java.awt.Point;

class operator_overiding{
	int x1=0;
	int y1=0;
	int x2=0;
	int y2=0;
	
	operator_overiding buildRect(int x1, int y1,int x2, int y2) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
		return this;
	}

	operator_overiding buildRect(Point topLeft, Point bottomRight) {
		x1=topLeft.x;
		y1=topLeft.y;
		x2=bottomRight.x;
		y2=bottomRight.y;
		return this;
	}
	
	operator_overiding buildRect(Point topLeft, int w, int h){
		x1=topLeft.x;
		y1=topLeft.y;
		x2=(x1+w);
		y2=(y1+h);
		return this;
	}

	void printRect() {
		System.out.print("My Rect <" +x1+ ", " +y1);
		System.out.print("My Rect <" +x2+ ", " +y2);
	}

	public static void main(String args[]){
		operator_overiding rect=new operator_overiding();
		System.out.print("Calling First Time");
		rect.buildRect(25,25,50,50);
		rect.printRect();
		System.out.print("------------");
		System.out.print("--Second---");
		rect.buildRect(new Point(10,10), new Point(10,10));
		rect.printRect();
		System.out.print("------------");
		System.out.print("---Third-------");
		rect.buildRect(new Point(10,10),50,50);
		rect.printRect();
	}
}



