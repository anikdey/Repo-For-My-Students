package saccha.gameBoard;

public class GameBoard {

    ScoreEntry[] entry;

    int lastPlayer = 0;

    public GameBoard(){
        entry = new ScoreEntry[5];
    }
    public GameBoard(int size){
        entry = new ScoreEntry[size];
    }

    public void addScore(ScoreEntry score){
        int newScore =score.getScore();

        if(lastPlayer < entry.length || newScore >entry[lastPlayer-1].getScore()){

            if (lastPlayer < entry.length){
                lastPlayer++;
            }

            int temp = lastPlayer-1;

            while (temp>0 && entry[temp-1].getScore()<newScore){
                entry[temp]=entry[temp-1];
                temp--;
            }
            entry[temp]=score;
        }
    }
    public void remove(int index){

    }
}
