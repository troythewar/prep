import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


@SuppressWarnings("serial")
public class overide_check extends java.applet.Applet {
	
	Font f =new Font("Times New Roman",Font.BOLD,36);
	public void paint(Graphics g)
	{
		g.setFont(f);
		g.setColor(Color.BLUE);
		g.drawString("Hello World", 5, 50);
		
	}
	
	public static void main(String[] args) {
		
		
	}

}
