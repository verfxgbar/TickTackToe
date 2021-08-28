import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		boolean player1 = true;
		while (TickTackToe.player1 == "" || TickTackToe.player2 == "")
		{
			System.out.println("Hallo! Wie ist dein Name Spieler 1?");
			TickTackToe.player1 = scanner.nextLine();
			System.out.println("Super! Und wie ist der Name von Spieler 2?");
			TickTackToe.player2 = scanner.nextLine();
			System.out.println("Super! Lasst das TickTackToe Spiel beginnen!");
			TickTackToe.gameStarted = true;
			break;
		}
		TickTackToe.visualizeBoard((player1 ? 1 : 2), TickTackToe.board);
		while (TickTackToe.gameStarted)
		{
			String position = scanner.nextLine();
			player1 = !player1;
			TickTackToe.changeBoard((player1 ? 1 : 2), Integer.parseInt(position));
		}
	}
  
}
