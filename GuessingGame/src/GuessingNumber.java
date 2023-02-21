import java.util.Scanner;

public class GuessingNumber {
      static int number ;
	public static void
    guessingNumberGame(int k)
    {
		if(k!=0)
		{
		  try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Guess the number: ");
			 int guess=sc.nextInt();
			 if(guess==number)
			 {
				 System.out.println("Congratulations You guessed the number");
				 score(k);
			 }
			 else if(number>guess)
			 {
				 System.out.println("The number is greater than "+guess);
				 guessingNumberGame(k-1);
			 }
			 else if(number<guess)
			 {
				 System.out.println("The number is less than "+guess);
				 guessingNumberGame(k-1);
			 }
		}
		}
		else
		{
			System.out.println("You have exhausted 5 trials");
		}
    }
    static void score(int i)
    {
    	if(i==5)
    	{
    		 System.out.println("\nYour Score is 10 out of 10");
    	}
    	else if (i==4)
    	{
    		 System.out.println("\nYour Score is 8 out out of 10");
    	}
    	else if (i==3)
    	{
    		 System.out.println("\nYour Score is 6 out of 10");
    	}
    	else if (i==2)
    	{
    		 System.out.println("\nYour Score is 4 out of 10");
    	}
    	else if (i==1)
    	{
    		 System.out.println("\nYour Score is 2 out of 10");
    	}
    }
    public static void main(String arg[])
    {
    	    number = 1 + (int)(100 * Math.random());
 			System.out.println("*A number is chosen between 1 to 100.* \n Guess the number within 5 trials.");
  
        guessingNumberGame(5);
    }

}
