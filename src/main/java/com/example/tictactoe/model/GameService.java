package com.example.tictactoe.model;

import org.springframework.stereotype.Service;

@Service
public class GameService {
    private String[] board = new String[9];
    private String currentPlayer = "X";

    private final int[][] winPatterns = {
            {0,1,2},{3,4,5},{6,7,8},
            {0,3,6},{1,4,7},{2,5,8},
            {0,4,8},{2,4,6}
    };

    public String makeMove(int position) {
        if (board[position] != null) {
            return "Invalid move! Box already taken.";
        }
        board[position] = currentPlayer;
        String winner = checkWinner();
        String moveMsg = "Player " + currentPlayer + " played at " + position;
        if (winner != null) {
            return moveMsg + " | Winner: Player " + winner;
        }
        currentPlayer = currentPlayer.equals("X") ? "O" : "X";
        return moveMsg;
    }

    public String resetGame() {
        board = new String[9];
        currentPlayer = "X";
        return "Game reset. Player X starts.";
    }

    private String checkWinner() {
        for (int[] pattern : winPatterns) {
            String p1 = board[pattern[0]];
            String p2 = board[pattern[1]];
            String p3 = board[pattern[2]];
            if (p1 != null && p1.equals(p2) && p2.equals(p3)) {
                return p1; // return "X" or "O"
            }
        }
        return null;
    }
}
