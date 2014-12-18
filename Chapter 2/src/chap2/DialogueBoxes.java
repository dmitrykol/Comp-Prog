/**
 * 
 */
package chap2;

import javax.swing.JOptionPane;
public class DialogBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Hello World") ;
		
		//showInput ONLY RETURNS STRING VALUES!!!!!!
		String name=JOptionPane.showInputDialog( "enter your name") ;
	
		String ageS=JOptionPane.showInputDialog( "enter your age") ;
		
		String avgS=JOptionPane.showInputDialog( "enter your average") ;
		
		
		//parsing strings - converting to int, double
		int age=Integer.parseInt(ageS);
		
		double avg=Double.parseDouble(avgS);
		
		JOptionPane.showMessageDialog(null,"age = "+age);
		JOptionPane.showMessageDialog(null,"avg = "+avg);
		
		