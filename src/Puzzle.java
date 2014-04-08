
public class Puzzle {

	public int[] solution;
	public int[] currentState;
	
	Puzzle() {
		
		//Set solution
		setSolution();
		
	}
	
	public void setSolution() {
		
		solution[0] = 4;
		solution[1] = 4;
		solution[2] = 0;
		
	}
	
	public boolean checkIfPuzzleIsSolved( int mug1, int mug2, int mug3 ) {
		
		if ( solution[0] == mug1 &&
			 solution[1] == mug2 &&
			 solution[2] == mug3
		)
			return true;
		else
			return false;
		
	}

}
