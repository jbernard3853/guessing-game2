import java.util.InputMismatchException;
import java.util.Scanner;
// its me Usman juhurdddd
//hey friend hahahhaha
public class GuessingGame {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int guess = 0;
		int guessAmount = 1;
		int answer = (int)(Math.random() * 10) + 1;
		
		while (guess != answer)
		{
			
			boolean isNumber = false;
			while (!isNumber)
			{
				try
				{
					System.out.println("print out you guess");
					guess = input.nextInt();
					isNumber = true;
				}
				catch (InputMismatchException e)
				{
					System.out.println("That was error: " + e);
					System.out.println("Please try again");
				}
			}
			if (guess != answer)
			{
				System.out.println("Wrong Number! try again");
				guessAmount++;
			}
		}
		System.out.println("Congratulations! You guessed the number in " + guessAmount + " tries");
		System.out.println("If you want to play again say \"yes\"");
		
	}

}
