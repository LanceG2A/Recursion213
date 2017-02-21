import java.util.Scanner; //in order to get input from th user

public class Babylon  //Lance Ackerson
{

	public static void main(String[] args) //Main Method 
	{
		Scanner keyboard = new Scanner(System.in); // create a Scanner to get user input
		System.out.println("What would you like to take the square root of?  Enter an integer.");
		int s = keyboard.nextInt(); //int to hold the number we are taking the square root of
		System.out.println("How much error will you tolerate? Enter an integer.");
		int e = keyboard.nextInt();//int to hold the tolerable error
		System.out.println("What do you think the square root is?");
		int guess = keyboard.nextInt(); // int for the guess of the square root
		
		System.out.println("The square root is approximately: " + square(s, e, guess)
							+ "\nWith an error of " + e
							+ "\nThe actual square root is: " + Math.sqrt(s));
		/*the above print statement prints the approximate square root based on calculations
		 * done in the square method.  It also prints the actual squre root and the 
		 * amount of error that was tolerated for the approximate square root
		 */
		keyboard.close();
		//to close the Scanner
	}
	
	public static double square(int squareRoot, int error, int guess)//Calculation method
	{
		//This method checks the guess square root with the real one
		// If the guess is within correct within the specified error then 
		//the guess is returned
		//Otherwise the guess is adjusted using calculations and the method is re-run with the new guess
		if(Math.sqrt(squareRoot) <= (guess + error) && Math.sqrt(squareRoot) >= (guess - error))
			return guess;
		int newGuess = (guess + (squareRoot/guess))/2;
		return square(squareRoot, error, newGuess);
	}
	
	
}
