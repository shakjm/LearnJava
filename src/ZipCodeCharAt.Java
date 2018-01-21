import java.util.Scanner;
import javax.swing.JOptionPane;

//This code checks for zip code using switch statements.
public class ZipCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String zip;
		zip = JOptionPane.showInputDialog("Enter first zip number");
		int zcode = zip.charAt(0);
		System.out.println(zip);
		System.out.println(zip.charAt(0));
		
		switch (zip.charAt(0))
		{
		case '0': case '1': case '2': case '3': case '4':
			System.out.println("Zip code at 0,1,2,3 or 4");
			break;
			
		default:
			System.out.println("default");
		

// Try with charAt function.
		
		}
			
		
		
		
	}

}
