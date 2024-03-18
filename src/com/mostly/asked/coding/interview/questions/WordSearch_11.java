package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.List;

public class WordSearch_11 {
	
	 static boolean[][] visited;

	    public  static List<String> findWords(char[][] board, String[] words) {

	        visited = new boolean[board.length][board[0].length];

	        List<String> list = new ArrayList<>();

	        for (int k = 0; k < words.length; k++) {

	            String word = words[k];

	            for (int i = 0; i < board.length; i++) {
	                for (int j = 0; j < board[i].length; j++) {

	                    if ( board[i][j]==word.charAt(0) && searchWord(i, j, 0, word, board)) {

	                        list.add(word);
	                    }
	                }
	            }
	        }

	        return list;

	    }

	    private static  boolean searchWord(int i, int j, int index, String word, char board[][]) {

	        if (index == word.length()) {

	            return true;
	        }

	        if (i < 0 || i >= board.length || j < 0 || j >= board.length || word.charAt(i) != board[i][j]
	                || visited[i][j]) {

	            return false;
	        }

	        visited[i][j] = true;

	        if (searchWord(i + 1, j, index + 1, word, board) ||
	                searchWord(i - 1, j, index + 1, word, board) ||
	                searchWord(i, j + 1, index + 1, word, board) ||
	                searchWord(i + 1, j - 1, index + 1, word, board)) {
	            return true;
	        }

	        visited[i][j] = false;

	        return false;
	    }

	public static void main(String[] args) {
	
		
		char board[][]= {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
		
		String words[]= {"oath","pea","eat","rain"};

		System.out.println(findWords(board, words));
	}

}
