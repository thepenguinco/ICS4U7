package JavaReview4;

import java.util.*;

/*
 * Minesweeper
 */
public class JavaReview4_4 
{
	public static char[][] generateMinesweeper(char[][] board, int N, int M)
	{
		int mineCount = 0;
		int[] flagA = {1, -1, 0};
		int[] flagB = {1, -1, 0};
		char[][] minesweeperBoard = new char[N+2][M+2];
		for (int i = 1; i <= N; i++) 
		{
			for (int j = 1; j <= M; j++) 
			{
				if (board[i][j] == '*')
				{
					minesweeperBoard[i][j] = '*';
				}
			}
		}
		for (int i = 1; i <= N; i++) 
		{
			for (int j = 1; j <= M; j++) 
			{
				if (board[i][j] == '.')
				{
					for (int k: flagA) {
						for (int l: flagB) {
							if (board[i+k][j+l] == '*') 
							{
								mineCount = mineCount + 1;
							}
						}
					}
					minesweeperBoard[i][j] = Character.forDigit(mineCount, 10);
					mineCount = 0;
				}
			}
		}
		return minesweeperBoard;
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		scanner.nextLine();
		char[][] board = new char[N+2][M+2];
		char[][] minesweeper;
		String buffer;
		for (int i = 1; i <= N; i++) 
		{
			buffer = scanner.nextLine();
			for (int j = 1; j <= M; j++) 
			{
				board[i][j] = buffer.charAt(j-1);
			}
		}
		minesweeper = generateMinesweeper(board, N, M);
		for (int i = 1; i <= N; i++) 
		{
			for (int j = 1; j <= M; j++) 
			{
				System.out.print(minesweeper[i][j]);
			}
			System.out.println();
		}
	}
}
