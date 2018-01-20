import java.util.Scanner;
import javax.swing.JOptionPane;


public class ZipCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int zip;
		zip = Integer.parseInt(JOptionPane.showInputDialog("Enter first zip number"));
		
		switch (zip)
		{
		case 0:
			System.out.println("Zip code 0");
			break;
			
		default:
			System.out.println("default");

		
		}
			
		
		
		
	}

}
