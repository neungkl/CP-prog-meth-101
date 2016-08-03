
public class BoardControl {
	
	public final static int BLANK = 0;
	public final static int X_CHIP = 1;
	public final static int O_CHIP = 2;
	
	private int[][] board;
	
	private int chipCount;
	private boolean isGameEnd;
	
	private PlayerTurn player = new PlayerTurn();
	
	public BoardControl() {
		chipCount = 0;
		isGameEnd = false;
		board = new int[3][3];
	}
	
	public int[][] getBoard() {
		return board;
	}
	
	public void playO() {
		
		calculate();
		
		checkSomeoneWin();
		if(++chipCount == 9) {
			System.out.println("Both player are equals.");
			isGameEnd = true;
		}
	}
	
	public void playX() {
		int[] pos = player.play(board);
		if(pos.length != 2) {
			System.out.println("You should return with int[2] describe x and y position the put chip.");
			isGameEnd = true;
			return ;
		}
		if(board[pos[1]][pos[0]] != BLANK) {
			System.out.println("You return the incorrect position. board [x = " + pos[0] + ",y = " + pos[1] + "] is not empty.");
			isGameEnd = true;
			return ;
		}
		
		board[pos[1]][pos[0]] = X_CHIP;
		
		checkSomeoneWin();
		if(++chipCount == 9) {
			System.out.println("Both player are equals.");
			isGameEnd = true;
		}
	}
	
	public boolean isGameEnd() {
		return isGameEnd;
	}
	
	private void checkSomeoneWin() {
		int theWinner = whoWin();
		if(theWinner != BLANK) {
			isGameEnd = true;
			System.out.print("The Winner is ");
			System.out.println(theWinner == X_CHIP ? "You" : "Computer");
			return ;
		}
	}
	
	private int whoWin() {
		int[][] dir = {{1,0},{0,1},{1,1},{1,-1}};
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<dir.length; k++) {
					int cx = j + dir[k][0];
					int cy = i + dir[k][1];
					int ex = j + 2*dir[k][0];
					int ey = i + 2*dir[k][1];
					
					if(ex >= 0 && ex < 3 && ey >= 0 && ey < 3) {
						if(board[i][j] == BLANK) continue;
						if(board[i][j] == board[cy][cx] && board[cy][cx] == board[ey][ex]) {
							return board[i][j];
						}
					}
				}
			}
		}
		return BLANK;
	}
	
	private void calculate() {
		int x,y;
		while(true) {
			x = (int) (Math.random()* 3);
			y = (int) (Math.random()* 3);
			if(board[y][x] == BLANK) break;
		}
		board[y][x] = O_CHIP;
	}
}
