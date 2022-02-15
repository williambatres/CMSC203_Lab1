import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		String throwAwayEnter;
		char yesOrNoDecision;
		boolean yesOrNoFlag = false;
		Scanner movieInput = new Scanner(System.in);
		Scanner userInput = new Scanner(System.in);
		Scanner yesOrNoInput = new Scanner(System.in);
		Scanner Keyboard = new Scanner(System.in);
		Movie newMovie = new Movie(" ", " ", 0);
		Movie defaultMovie = new Movie();

		
		
		
		do 
		{
	
			System.out.print("Please enter the name" +
					" of a movie \n");
			
			newMovie.setTitle(movieInput.nextLine());

			
			System.out.println("Please enter the rating" +
					" of the movie");
			newMovie.setRating(movieInput.nextLine()) ;
			
			System.out.println("Please enter the amount" +
						" of tickets sold for this movie");
			newMovie.setSoldTickets(movieInput.nextInt()) ;
			
			System.out.println(newMovie);
			
			System.out.println("Would you like to enter another?"+ 
							" (y or n)");
			yesOrNoDecision = yesOrNoInput.next().charAt(0);
			switch(yesOrNoDecision)
			{
				case 'y':
				case 'Y':
				{
					yesOrNoFlag = true;
					break;
				}
				case 'n':
				case 'N':
				{
					yesOrNoFlag = false;
					break;
				}
			}
		movieInput.nextLine();
		}while(yesOrNoFlag == true);
		
		System.out.println("Goodbye");
		
		
		userInput.close();
		yesOrNoInput.close();
	}

}
