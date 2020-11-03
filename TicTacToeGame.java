import java.util.*;

public class TicTacToeGame
{
	Scanner me=new Scanner(System.in);
	String user_input, computer_input;

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

	public void get_input()
	{
		System.out.println("Please Enter 'O' or 'X' ");
		user_input=me.next();

		System.out.println(user_input);

		if(user_input=="O")
		{
			computer_input="X";
		}
		else if(user_input=="X")
		{
			computer_input="O";
		}
		else
		{
			System.out.println("Invalid input... Please Enter 'O' or 'X'");
		}

	}
	public static void main(String args[])
	{
		TicTacToeGame obj= new TicTacToeGame();
		obj.get_input();
	}
}