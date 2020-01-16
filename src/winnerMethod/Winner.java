package winnerMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * verificam care sunt combinatiile castigatoare si afisam apoi daca cineva a castigat
 */
public class Winner {

    public String checkWinner(List<Integer> firstList, List<Integer> secondList) {

        List<Integer> topRow = Arrays.asList(1, 2, 3);
        List<Integer> middleRow = Arrays.asList(4, 5, 6);
        List<Integer> lastRow = Arrays.asList(7, 8, 9);
        List<Integer> firstRow = Arrays.asList(1, 4, 7);
        List<Integer> secondRow = Arrays.asList(2, 5, 8);
        List<Integer> thirdRow = Arrays.asList(3, 6, 9);
        List<Integer> firstCrossRow = Arrays.asList(1, 5, 9);
        List<Integer> secondCrossRow = Arrays.asList(3, 5, 7);
        List<Integer> thirdCrossRow = Arrays.asList(9, 5, 1);
        List<Integer> fourthCrossRow = Arrays.asList(7, 5, 3);


        List<List> winners = new ArrayList<>();
        winners.add(topRow);
        winners.add(middleRow);
        winners.add(lastRow);
        winners.add(firstRow);
        winners.add(secondRow);
        winners.add(thirdRow);
        winners.add(firstCrossRow);
        winners.add(secondCrossRow);
        winners.add(thirdCrossRow);
        winners.add(fourthCrossRow);
        // System.out.println(winners);
        for (List list : winners) {
            if ((firstList.size() + secondList.size() == 9) && firstList.containsAll(list)) {
                return "You have pulled it off";
            }
            else if(firstList.size() + secondList.size() == 9 && !(firstList.containsAll(list))) {
                return "Draw!";
            }
            //metoda prin care putem itera printr-o colectie
            else if (firstList.containsAll(list) ) {
                return "You are the winner";

            } else if (secondList.containsAll(list)) {
                return "The computer has won";
            }

            }



        return " ";
    }
}
