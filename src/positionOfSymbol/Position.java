package positionOfSymbol;

import java.util.Random;
import java.util.Scanner;

public class Position {

    public int playerPick(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce a valid postion !");
        int playerPos = scanner.nextInt();
        return playerPos;

    }

    public int cpuPick(){
        Random random = new Random();
        int cpuPos = random.nextInt(9)+1;
        return cpuPos;
    }
}
