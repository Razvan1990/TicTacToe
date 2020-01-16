package main;

import positionOfSymbol.Position;
import positioning.MakingMove;
import printing.PrintingBoard;
import winnerMethod.Winner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.disjoint;

public class MainMethod {

    public static void main(String[] args) {
        MakingMove mkv = new MakingMove();
        PrintingBoard printingBoard = new PrintingBoard();
        Position position = new Position();
        Winner winner = new Winner();



         List<Integer> playerPositions = new ArrayList<>();
        List<Integer> cpuPositions = new ArrayList<>();

        char[][] table =
                {
                        {' ', '|', ' ', '|', ' '},
                        {'-', '+', '-', '+', '-'},
                        {' ', '|', ' ', '|', ' '},
                        {'-', '+', '-', '+', '-'},
                        {' ', '|', ' ', '|', ' '}
                };
        printingBoard.printTheTable(table);


        while (true) {
            /**
             * totul se face intr-o bucla while pentru a permite utilizatorului sa tot introduca simboluri si calculatorul sa raspunda
             */
            int playerPos = position.playerPick();


            /*sa nu cumva sa introduca in aceiasi locatie introdusa de noi= verificam daca lista noastra contine intai pozitiile introduse de noi
            si apoi verificam daca nu cumva sunt introduse in lista de cpu, lista de pozitii ale playerului*/
          //  boolean areDifferent = Collections.disjoint(playerPositions, cpuPositions);
            while (playerPositions.contains(playerPos) || cpuPositions.contains(playerPos))
                {
                    System.out.println("Please introduce a position which is not taken");
                    playerPos = position.playerPick();
                }
                mkv.placeSymbol(table, "player", playerPos, playerPositions, cpuPositions);
                // playerPositions.add(playerPos);
                printingBoard.printTheTable(table);
                System.out.println();
                String result = winner.checkWinner(playerPositions, cpuPositions);
                if (result != " ") {
                    //printam rezultatul
                    System.out.println(result);
                    //folosim break ca sa terminam programul de tot
                    break;

                }

                //la fel procedam si pentru cpuPos
                int cpuPos = position.cpuPick();
                while (playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
                    cpuPos = position.cpuPick();

                }
                mkv.placeSymbol(table, "cpu", cpuPos, playerPositions, cpuPositions);
                // cpuPositions.add(cpuPos);
                printingBoard.printTheTable(table);
                result = winner.checkWinner(playerPositions, cpuPositions);
                if (result != " ") {
                    System.out.println(result);
                    break;
                }

            }
        }


    }



