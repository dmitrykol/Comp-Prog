package graphics;
import javax.swing.JApplet;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
public class CustomFontColor extends JApplet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics canvas) {
		
		canvas.setColor(Color.cyan);
		canvas.fillRect(0,0,900,900);
		
		Color myBrown = new Color(80, 0,159);

		canvas.setColor(myBrown);
		canvas.fillOval(10, 50, 30, 60);

		Font script80 = new Font("BrushScriptStd", Font.PLAIN, 80);
		canvas.setColor(Color.red);
		canvas.setFont(script80);
		canvas.drawString("Java Rules!!!", 120, 120);
	}
	
}
		




	

		



