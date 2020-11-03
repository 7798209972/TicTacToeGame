public class TicTacToeGame
{

	TicTacToeGame()
	{
		System.out.println("=========================");
		System.out.println("Welcome to TicTacToeGame");
		System.out.println("=========================");
	}


	static char[] board;

	public void empty_array()
	{
		for(int i=1; i<board.length; i++)
		{
			board[i]=' ';

		}

	}

	public void get_info()
	{

	}
	public static void main(String args[])
	{
		TicTacToeGame obj= new TicTacToeGame();
		obj.empty_array();
	}
}