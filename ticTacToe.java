
import java.util.Scanner;

public class ticTacToe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        // Initialize the board with 0 (empty)
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                board[i][j] = ' ';
            }
        }
        char currentPlayer = 'O';
        boolean gameWon = false;
        while(!gameWon){
            System.out.print("Player " + currentPlayer + ", enter your move (row and column): ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            System.out.println();
            if(board[row][col] == ' '){
                board[row][col] = currentPlayer;
                gameWon = checkWin(board, currentPlayer);
                if(gameWon){
                    System.out.println("Player " + currentPlayer + " wins!");
                }
                else if(boardFull(board)){
                    System.out.println("It's a draw!");
                    break;

                }
                 else {
                    currentPlayer = (currentPlayer == 'O') ? 'X' : 'O';
                }
            }
            else{
                System.out.println("Invalid move!! Try again.");
            }
            printBoard(board);
            System.out.println("-------------------");
        }
        sc.close();
    }
    public static boolean boardFull(char[][] board){
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                if(board[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }
    public static void printBoard(char[][] board){
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                System.out.print(board[i][j] + " ");
                if(j < board[i].length - 1){
                    System.out.print("| ");
                }
            }
            System.out.println();
        }
    }
    public static boolean checkWin(char[][] board, char player){
        // Check rows
        for(int i = 0;i<board.length;i++){
            if(board[i][0] == player && board[i][1] == player && board[i][2] == player){
                return true;
            }
        }
        // Check columns
        for(int j = 0;j<board[0].length;j++){
            if(board[0][j] == player && board[1][j] == player && board[2][j] == player){
                return true;
            }
        }
        // Check diagonals
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }
}
