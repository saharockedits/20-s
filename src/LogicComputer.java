public class LogicComputer  {
    int matchesOnTable = 17 ;


    public int matchesComp (int matchesPlayer) {
        int matchesComp = 4 - matchesPlayer;
        return matchesComp ;
    }

    public void countMatches(int useMatches){
        this.matchesOnTable -= useMatches ;
    }


    public int getMatchesOnTable(){
        return matchesOnTable ;
    }


}