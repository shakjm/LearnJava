import java.util.Scanner;

import javax.swing.JOptionPane;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//JOptionPane.showMessageDialog(null, "message");
		//char name = JOptionPane.showInputDialog("Enter name");
		//Scanner stdIn = new Scanner(System.in);
		//String name;
		//System.out.print("Enter name: ");
		//int lel;
		//lel = stdIn.nextInt();
		//name = stdIn.nextLine();
		//String frey = stdIn.nextLine();
		//System.out.println("A" + name +" "+ frey);
		
/* This part of codes is to show an example with the wrong method to initiate
 * control statements that detects for a character for program to run*/
		
		/*Scanner nam = new Scanner(System.in);
		String name;
		name = nam.nextLine();
		char namee = name.charAt(0);
		if (name == "k" || name == "K")
		{
			System.out.println("Success");
		}
		System.out.println(name);
		*/
/* This part of codes is to show the right method for control statement with character inputs*/
		
		/*Scanner nam = new Scanner(System.in);
		String name;
		name = nam.nextLine();
		char namee = name.charAt(0);
		if (name.equals("k") || name.equals("K"))
		{
			System.out.println("Success");
		}
		System.out.println(name);
		*/
/* Ignores Case method */
		Scanner nam = new Scanner(System.in);
		String name;
		name = nam.nextLine();
		char namee = name.charAt(0);
		if ((name.equalsIgnoreCase("k")))
		{
			System.out.println("Success");
		}
		System.out.println(name);
	
		
		
	} //end of main

} //end of file class
