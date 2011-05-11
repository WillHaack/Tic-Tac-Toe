/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Will
 */
public class Board {

    private int[][] gameboard; //0 is empty, 1 is x, 2 is 0

    public Board() {
        gameboard = new int[3][3];
    }

    public boolean makeMove(int x, int y, int n) {
        if (gameboard[x][y] == 0) {
            gameboard[x][y] = n;
            return true;
        }
        return false;
    }

    public void printBoard() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (gameboard[r][c] == 0) {
                    System.out.print("  ");
                } else if (gameboard[r][c] == 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }

            }
        }
    }

    public boolean canMove(int x, int y) {
        return gameboard[x][y] == 0;
    }
}
