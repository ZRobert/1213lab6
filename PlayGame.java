import javax.swing.JOptionPane;
import java.util.Random;

public class PlayGame{
	public static void main(String[] args){
		
		HiLow game = new HiLow();
		
		game.outputDescription();
		
		do{
		
			game.guess();	//Prompts User for Guess, Tells if guess is too high or too low, Increments counter
			
		}while(game.keepPlaying()); //While the keepPlaying() method returns true, the loop will continue to repeat
			
	}
}//End of PlayGame.java

 class HiLow{
	
	//Fields
	private boolean keepPlaying;
	private int numOfGuesses, randomNumber;
	
	public HiLow(){
		
		//Instantiate a temporary Random object
		Random randomGenerator = new Random();
		
		//Initialize Fields
		randomNumber = randomGenerator.nextInt(100)+1;
		numOfGuesses = 0;
		keepPlaying = true;
		
	}
	
	//Return value of keepPlaying. True means the user guessed incorrectly so they should keep playing.
	public boolean keepPlaying(){
		return keepPlaying;
	}
	
	//A small description of the game
	public void outputDescription(){
		JOptionPane.showMessageDialog(null, "A game where you guess a number in the range [1, 100] and I tell\n"
											+ "you if the guess is too high, too low, or just right.");
	}
	
	//Use if-else structure to implement the rules of the game
	public void guess(){
		
		int guess = Integer.parseInt(JOptionPane.showInputDialog("Guess the value of the random number."));
		
		numOfGuesses++;
		
		if(guess > randomNumber)
			JOptionPane.showMessageDialog(null, "Your guess was too high");
		else if(guess < randomNumber)
			JOptionPane.showMessageDialog(null, "Your guess was too low");
		else
		{
			JOptionPane.showMessageDialog(null, "You guessed correctly");
			keepPlaying = false;
		}
		//Implement the rest of this Method
		
	}
}