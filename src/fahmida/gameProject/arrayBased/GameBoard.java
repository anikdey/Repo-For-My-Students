package fahmida.gameProject.arrayBased;

public class GameBoard {

    private Score[] scores = null;
    private int capacity = 0;
    private int currentPosition = -1;

    public GameBoard(int capacity){
        this.capacity = capacity;
        scores = new Score[capacity];
    }

    public void scoreAdd(Score score){

        if(currentPosition < capacity - 1 || scores [currentPosition].getScore() < score.getScore()){
            if(currentPosition < capacity -1){
                currentPosition++;
            }
            int temporary = currentPosition ;
            while(temporary > 0 && scores [temporary - 1].getScore() < score.getScore()){
                scores[temporary] = scores[temporary - 1];
                temporary--;
            }
            scores[temporary] = score;
        }
    }
    public Score removeScore(int index) {
        Score score;

        if (index < 0 || index > currentPosition) {
            System.out.println("Score cannot be added in that index");

            return null;
        }
        score = scores[index];
        while (index < currentPosition){
            scores [index] = scores[index + 1];
            index++;
        }
        scores[currentPosition] = null;
        currentPosition--;
        return score;

    }
    public void printGameboard(){
        if (currentPosition < 0){
            System.out.println("gameboard is empty");
            return;
        }
        for(int i = 0; i <= currentPosition; i++){
            Score score = scores[i];
            System.out.println((i + 1)+ ". Name :" + score.getName()+ ", score :" + score.getScore());
        }
        System.out.println();
    }
    private static Score getScoreObject(String name,int score){
        return new Score(name,score);
    }

    public static void main(String[] args) {
        GameBoard gm = new GameBoard(4);

        gm.scoreAdd(getScoreObject("Upama" , 23));
        gm.scoreAdd(getScoreObject("rahi" , 24));
        gm.scoreAdd(getScoreObject("lima" , 25));
        gm.scoreAdd(getScoreObject("adiba" , 26));
        gm.printGameboard();
        gm.scoreAdd(getScoreObject("prema" , 27));
        gm.printGameboard();

    }

}
