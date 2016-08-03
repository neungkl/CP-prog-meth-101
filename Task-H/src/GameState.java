
public class GameState {

	private float timeStamp;
	
	private BoardControl boardControl;
	
	private static final int IDLE = 0;
	private static final int O_TURN = 1;
	private static final int X_TURN = 2;
	private static final int END = 3;
	
	private int currentState;
	private final float timeDelay = 750f; 
	
	public GameState() { 
		timeStamp = 0f;
		currentState = IDLE;
		boardControl = new BoardControl();
	}
	
	public void update() {
		timeStamp += 1000f / 60;
		
		if(currentState == IDLE) {
			if(timeStamp > 500f) {
				currentState = X_TURN;
				timeStamp = 0f;
			}
		} else if(currentState == O_TURN) {
			if(timeStamp > timeDelay) {
				boardControl.playO();
				if(boardControl.isGameEnd()) {
					currentState = END;
				} else {
					currentState = X_TURN;
					timeStamp = 0f;
				}
			}
		} else if(currentState == X_TURN) {
			if(timeStamp > timeDelay) {
				boardControl.playX();
				if(boardControl.isGameEnd()) {
					currentState = END;
				} else {
					currentState = O_TURN;
					timeStamp = 0f;
				}
			}
		} else if(currentState == END) {
			
		}
	}
	
	public int[][] getBoard() {
		return boardControl.getBoard();
	}
}
