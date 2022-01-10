package saccha.gameBoard;

public class GameBoard {

    ScoreEntry[] entry;

    int position = -1;

    public GameBoard(){
        entry = new ScoreEntry[5];
    }
    public GameBoard(int size){
        entry = new ScoreEntry[size];
    }

    public void addScore(ScoreEntry score){
        int newScore =score.getScore();

        if(position < entry.length-1 || newScore >entry[position].getScore()){

            if (position < entry.length-1){
                position++;
            }

            int temp = position;

            while (temp>0 && entry[temp-1].getScore()<newScore){
                entry[temp]=entry[temp-1];
                temp--;
            }
            entry[temp]=score;
        }
    }
    private static ScoreEntry getEntryObject(String name,int score){
        return new ScoreEntry(name,score);
    }
    public ScoreEntry remove(int index){
        if(index<0 || index> position){
            System.out.println("No score is bound to that index");
            return null;
        }
        ScoreEntry data;
        data = entry[index];

        while (index < position){
            entry[index] = entry[index+1];
            index++;
        }
        entry[position] = null;
        position--;
        return data;

    }
    public void printBoard(){
        if(position < 0){
            System.out.println("Board is empty");
            return;
        }

        for(int i=0; i<=position; i++) {
            ScoreEntry data = entry[i];
            System.out.println((i+1)+"name "+data.getName()+"score "+data.getScore());
        }
    }

    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        board.addScore(getEntryObject("player 1",100));
        board.addScore(getEntryObject("player 2",150));
        board.addScore(getEntryObject("player 3",180));
        board.addScore(getEntryObject("player 4",190));
        board.addScore(getEntryObject("player 5",200));
        board.printBoard();
        int index = 2;
        System.out.println("after removing index at the position "+index+" index");
        board.remove(index);
        board.printBoard();
    }
}
