import java.util.Scanner;

public class Exercise11 {
    public static void main(String argv[]){
        int numRows = 8;
        int numCols = 8;
        char board[][] = new char [numRows][numCols];
        int totalShips = 10;
        int shots = 0;
        int sunk = 0;
        char letter;
        int colNum;
        Scanner input = new Scanner(System.in);

        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board.length; col++){
                board[row][col] = ' ';
            }
        }

        int randomR, randomC;
        for (int ships = 0; ships < totalShips; ships++){
            randomR = (int) (Math.random()*numRows);
            randomC = (int) (Math.random()*numCols);
            if (board[randomR][randomC] == ' '){
                board[randomR][randomC] = 'S';
            }
        }

        System.out.println("GAME START");
        System.out.println("Shots: " + shots);
        System.out.println("Sunken ships: " + sunk);

        while (sunk < totalShips){
            System.out.print("Enter letter (row): ");
            letter = input.next().toUpperCase().charAt(0);
            int rowNum = letter - 'A';
            System.out.print("Enter number (column): ");
            colNum = input.nextInt() - 1;

            if (rowNum < 0 || rowNum >= numRows || colNum < 0 || colNum >= numCols){
                System.out.println("Error. Enter a valid letter/number combination.");
                continue;
            }

            if (board[rowNum][colNum] == ' '){
                board[rowNum][colNum] = 'O';
            }
            else{
                if(board[rowNum][colNum] == 'S') {
                    board[rowNum][colNum] = 'X';
                    sunk++;
                }
            }
            shots++;

            System.out.println("Shots: " + shots);
            System.out.println("Sunken ships: " + sunk);

            System.out.print(" ");
            for (int col = 1; col <= board[1].length; col++){
                System.out.print(col + " ");
            }
            System.out.println();
            char letterBoard = 'A';
            for (int row = 0; row < board[0].length; row++){
                System.out.print(letterBoard + " ");
                for (int col = 0; col < board[1].length; col++){
                    if (board[row][col] == 'S'){
                        System.out.print(' ');
                    }
                    else{
                        System.out.print(board[row][col] + " ");
                    }
                }
                System.out.println();
                letterBoard++;
            }
        }
        System.out.println("YOU WIN!");
    }
}