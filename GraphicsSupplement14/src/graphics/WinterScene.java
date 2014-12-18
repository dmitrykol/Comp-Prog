package graphics;
import javax.swing.JApplet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class WinterScene extends JApplet{

		public void paint(Graphics canvas) {
			canvas.setColor(Color.cyan);
			canvas.fillRect(450, 450, 300, 300);
			canvas.fillRect(475,550,50,50);
			canvas.setColor(Color.black);
			canvas.drawRect(450, 450, 300, 300);
			canvas.drawRect(475,550,50,50);
			canvas.drawRect(575,550,50,50);
			canvas.drawRect(675,550,50,50);
			canvas.drawRect(675,650,50,50);
			canvas.drawRect(550,650,50,100);
			canvas.setColor(Color.white);
			canvas.fillRect(475,550,50,50);
			canvas.fillRect(575,550,50,50);
			canvas.fillRect(675,550,50,50);
			canvas.fillRect(675,650,50,50);
			canvas.fillRect(550,650,50,100);
			canvas.setColor(Color.black);
			canvas.drawLine(440,460,600,300);
			canvas.drawLine(760,460,600,300);
		}
}
