package com.mostly.asked.coding.interview.questions;


/**
 * 
 * Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

 

Example 1:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true
Example 2:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true
Example 3:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false
 * @author nadim
 *
 */
public class WordSearch {

	static boolean visited[][];

	public static boolean exist(char board[][], String word) {

		visited = new boolean[board.length][board[0].length];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {

				if (board[i][j] == word.charAt(0) && searchWord(i, j, 0, board, word)) {
					return true;
				}
			}
		}

		return false;

	}

	private static boolean searchWord(int i, int j, int index, char[][] board, String word) {

		if (index == word.length()) {
			return true;
		}

		if (i < 0 || i >= board.length || j < 0 || j >= board.length || word.charAt(0) != board[i][i]
				|| visited[i][j]) {

			return false;
		}

		visited[i][j] = false;

		if (searchWord(i - 1, j, index + 1, board, word) || searchWord(i + 1, j, index + 1, board, word)
				|| searchWord(i, j - 1, index + 1, board, word) || searchWord(i, j + 1, index + 1, board, word)) {
			return true;

		}

		visited[i][j] = false;

		return false;
	}

	public static void main(String[] args) {

		char board[][] = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };

		String word = "ABCCED";

		System.out.println(exist(board, word));

	}

}
