import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time: 
// Student ID: IT37/2015

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException{
		if (frames.size() == 10){
			throw new BowlingException();
		}
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		
	}
	
	// Returns the game score + bonus
	public int score(){
		int score = 0;
		boolean flagStrike = false;
		boolean flagSpare = false;
		boolean flagDoubleStrike = false;
		for (Frame f : frames){
			if (flagStrike){
				if (flagDoubleStrike){
					score += f.getFirstThrow();
					flagDoubleStrike = false;
				} else if (flagStrike == true && f.isStrike() == true){
					flagDoubleStrike = true;
				}
				score += f.getFirstThrow() + f.getSecondThrow();
				flagStrike = false;
				
			} else if (flagSpare){
				score += f.getFirstThrow();
				flagSpare = false;
			}
			if (f.isStrike()){
				flagStrike = true;
			} else if(f.isSpare()){
				flagSpare = true;
			}
			score += f.getFirstThrow() + f.getSecondThrow();
		}
		return score;
	}
}
