package positioning;

import positionOfSymbol.Position;

import java.util.List;

public class MakingMove {

    Position position = new Position();

    public void placeSymbol(char[][] board, String user, int pos, List<Integer> players, List<Integer> cpus) {
        char symbol = ' ';

        if (user.equals("player")) {
            symbol = 'X';
            players.add(pos);
        } else if (user.equals("cpu")) {
            symbol = 'O';
            cpus.add(pos);
        }


        switch (pos) {
            case 1:
                board[0][0] = symbol;
                break;
            case 2:
                board[0][2] = symbol;
                break;
            case 3:
                board[0][4] = symbol;
                break;
            case 4:
                board[2][0] = symbol;
                break;
            case 5:
                board[2][2] = symbol;
                break;
            case 6:
                board[2][4] = symbol;
                break;
            case 7:
                board[4][0] = symbol;
                break;
            case 8:
                board[4][2] = symbol;
                break;
            case 9:
                board[4][4] = symbol;
                break;
            default:
                System.out.println("Position is already introduced by the CPU.Enter a free space!");
                break;


        }

    }
}
