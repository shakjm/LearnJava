import java.util.Scanner;


public class Stamps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numSheets;
		String answer;
		int stamp;
		String user = "";
		int remainder1;

		
		Scanner inpot = new Scanner(System.in);
		System.out.println("Enter number of sheets being sent : ");
		numSheets = inpot.nextInt();
		
		
		if ((numSheets%5) >= 1) {
			remainder1 = 1;
		}
		else {
			remainder1 = 0;
		}
		
		
		stamp = (numSheets/5) + remainder1;
		System.out.println("Number of stamps needed are " + stamp);
		
		while (!(user.equalsIgnoreCase("y")||user.equalsIgnoreCase("n"))) {
			System.out.println("Please type Y to proceed, if not, N to cancel : ");
			Scanner inpot2 = new Scanner(System.in);
			user = inpot2.nextLine();
			if (user.equalsIgnoreCase("y")){
				System.out.println("Using " + stamp + " stamps.");
			}
			if (user.equalsIgnoreCase("n")){
				System.out.println("Don't mail");
			}
			
		}
	}

}
