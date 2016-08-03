
public class PlayerTurn {
	
	public int[] play(int[][] board) {
		int x,y;
		while(true) {
			x = (int) (Math.random() * 3);
			y = (int) (Math.random() * 3);
			if(board[y][x] == BoardControl.BLANK) break;
		}
		return new int[]{x,y};
	}
}
