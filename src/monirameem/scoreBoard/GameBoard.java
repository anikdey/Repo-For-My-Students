package monirameem.scoreBoard;

public class GameBoard {

    Score[] board;
    int lastPlayerNum = -1;

    GameBoard(int size) {
        board = new Score[size];
    }

    public void addScore(Score score) {
        int newScore = score.score;

        if (lastPlayerNum < board.length-1 || newScore > board[lastPlayerNum].score){
            if(lastPlayerNum < board.length-1)
                lastPlayerNum++;

            int temp = lastPlayerNum;

            while (temp > 0 && board[temp -1].score < newScore){
                board[temp] = board[temp-1];
                temp--;
            }
            board[temp] = score;
        }
    }

    public void remove(int index) {

        if (index <= 0){
            System.out.println("Invalid index");
            return;
        } else if (index > lastPlayerNum+1){
            System.out.println("Invalid index");
            return;
        }

        int temp = index-1;

        while (temp < lastPlayerNum){
            board[temp] = board[temp+1];
            temp++;
        }
        board[temp] = null;
        lastPlayerNum--;
    }

    public void printScore() {

        if (board != null){
            for (Score score : board){
                if (score == null)
                    return;
                System.out.println("Name : " + score.name + " Score : " + score.score);

            }
        }
    }

    public static void main(String[] args) {

        GameBoard board = new GameBoard(3);

        board.addScore(new Score("meem",44));
        board.addScore(new Score("fahmo",33));
        board.addScore(new Score("mimi",55));

        board.printScore();

    }
}
