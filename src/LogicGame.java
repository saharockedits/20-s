import java.util.Scanner;

public class LogicGame {


    public static void main(String[] args ) {
        OutputConsole output = new OutputConsole() ;
        Scanner scanner = new Scanner(System.in) ;
        LogicComputer logicComputer = new LogicComputer() ;
        output.startGame();
        while (logicComputer.getMatchesOnTable() > 1){
            output.turnPlayer(logicComputer.getMatchesOnTable());
            int matchesPlayer = scanner.nextInt();
            if (matchesPlayer <= 3 && matchesPlayer >= 1){
                logicComputer.countMatches(matchesPlayer);
                output.turnComputer(logicComputer.getMatchesOnTable(), logicComputer.matchesComp(matchesPlayer));
                logicComputer.countMatches(logicComputer.matchesComp(matchesPlayer));
            }else {
                output.errorCountMatches();
            }
        }
        output.gameOver();
        scanner.close() ;
    }

}