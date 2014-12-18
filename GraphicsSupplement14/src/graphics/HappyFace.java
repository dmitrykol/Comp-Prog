package graphics;

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
public class HappyFace extends JApplet {

	public void paint(Graphics canvas) {
		// draw smiley face
		//add a baby face, different colors and labels
		
		//the string, x1,y1
		canvas.drawString("baby smiley face!!!", 120, 280);
		canvas.setColor(Color.blue);
		
		//x1,y1,x2,y2 bounding box
		canvas.fillOval(100, 50, 200, 200);
		canvas.fillOval(50, 25, 100, 100);
		canvas.fillOval(250, 25, 100, 100);
		canvas.setColor(Color.black);
		canvas.drawOval(100, 50, 200, 200);
		canvas.drawOval(50, 25, 100, 100);
		canvas.drawOval(250, 25, 100, 100);
		canvas.fillOval(155, 100, 10, 30);
		canvas.fillOval(230, 100, 10, 30);
		canvas.drawArc(150, 160, 100, 50, 0,-180);
	
		//ordered pairs for the vertices {x1,x2,x3} {y1,y2,y3}...
	/*	int [ ] x = {20, 35, 50, };
		int [ ] y = {60, 105, 105};
		canvas.drawPolygon(x, y, 3);*/
		
		}
}
