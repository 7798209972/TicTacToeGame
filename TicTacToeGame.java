import java.util.*;

public class TicTacToeGame
{

	static char[] board;
	String user_input;
	Scanner me=new Scanner();

	TicTacToeGame()
	{
		System.out.println("=========================");
		System.out.println("Welcome to TicTacToeGame");
		System.out.println("=========================");
	}


	public void empty_array()
	{
		for(int i=1; i<board.length; i++)
		{
			board[i]=' ';

		}

	}


	public void get_input()
	{
		System.out.println("Please Enter 'X' or 'O'");
		user_input=me.nextline();

	}

	public static void main(String[] args)
	{
		TicTacToeGame obj= new 
	}
}