package printing;

public class PrintingBoard {

    public void printTheTable(char [][] matrix){
        for(char[] row:matrix){
            for(char c:row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
