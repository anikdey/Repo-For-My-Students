package gameBoard;

public class ScoreEntry {

    private int score;
    private String name;

    public ScoreEntry(int score,String name){
        this.score =score;
        this.name=name;
    }
    public int getScore(){
        return score;
    }
    public String getName(){
        return name;
    }

}
