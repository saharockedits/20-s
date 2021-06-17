public class OutputConsole {


    public void startGame(){
        System.out.println("На столе 20 спичек.");
        System.out.println(" - Количество выбранных компьютером спичек = 3.");
    }


    public void turnPlayer(int matchesOnTable){
        System.out.println("На столе осталось " + matchesOnTable + " спичек.");
        System.out.print(" - Ход игрока. Введите количество спичек: ");
    }


    public void turnComputer(int matchesOnTable, int matchesComp){
        System.out.println("На столе осталось " + matchesOnTable + " спичек.");
        System.out.println(" - Количество выбранных компьютером спичек = " + matchesComp);
    }


    public void errorCountMatches(){
        System.out.println("Некорректное количество спичек!");
    }


    public void gameOver(){
        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл! ");
    }


}