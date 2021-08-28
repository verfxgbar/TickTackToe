import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

public class TickTackToe
{

	/*
	 * 
	 * Man könnte es besser schreiben, ohne Frage aber dazu war ich ein bisschen
	 * zu faul.
	 * Außerdem habe ich keine Ahnung wie ich manche Sachen anders machen
	 * könnte.
	 * 
	 */

	public static String player1 = "";
	public static String player2 = "";

	public static boolean gameStarted = false;
	static char[][] board = { { ' ', '|', ' ', '|', ' ' }, { ' ', '+', ' ', '+', ' ' }, { ' ', '|', ' ', '|', ' ' } };

	public static void visualizeBoard(int player, char[][] board)
	{
		for (char[] reihen : board)
		{
			for (char platz : reihen)
				System.out.print(platz);
			System.out.println();
		}
		System.out.println((player == 1 ? player1 : player2) + " ist an der Reihe!");
	}

	public static void changeBoard(int player, int place)
	{
		char[][] newBoard = board;
		char XO = ' ';
		if (player == 1)
			XO = 'X';
		else
			XO = 'O';
		switch (place)
		{
		case 1:
			newBoard[0][0] = XO;
			break;
		case 2:
			newBoard[0][2] = XO;
			break;
		case 3:
			newBoard[0][4] = XO;
			break;
		case 4:
			newBoard[1][0] = XO;
			break;
		case 5:
			newBoard[1][2] = XO;
			break;
		case 6:
			newBoard[1][4] = XO;
			break;
		case 7:
			newBoard[2][0] = XO;
			break;
		case 8:
			newBoard[2][2] = XO;
			break;
		case 9:
			newBoard[2][4] = XO;
			break;
		}
		board = newBoard;
		for (int i = 0; i < 10; i++)
			System.out.println("\n");
		visualizeBoard(player, newBoard);
		if (checkBoard(player, newBoard))
		{
			System.out.println((player == 1 ? player1 : player2) + " hat das Spiel gewonnen!");
			gameStarted = false;
		}
	}

	private static boolean checkBoard(int player, char[][] board)
	{
		char[] list = { board[0][0], board[0][2], board[0][4], board[1][0], board[1][2], board[1][4], board[2][0], board[2][2], board[2][4] };
		char XO = ' ';
		if (player == 1)
			XO = 'X';
		else
			XO = 'O';

		// Vertikale Abfragen
		if (list[0] == XO && list[1] == XO && list[2] == XO)
			return true;
		else if (list[3] == XO && list[4] == XO && list[5] == XO)
			return true;
		else if (list[6] == XO && list[7] == XO && list[8] == XO)
			return true;

		// Horizontale Abfragen
		else if (list[0] == XO && list[3] == XO && list[6] == XO)
			return true;
		else if (list[1] == XO && list[4] == XO && list[7] == XO)
			return true;
		else if (list[2] == XO && list[5] == XO && list[8] == XO)
			return true;

		// Schraege Abfragen
		else if (list[0] == XO && list[4] == XO && list[8] == XO)
			return true;
		else if (list[2] == XO && list[4] == XO && list[6] == XO)
			return true;

		// Nicht gewonnen
		else
			return false;
	}

}
