package monirameem.scoreBoard;

public class GameBoard {

    Score[] board;
    int playerNum = 0;

    GameBoard(int size) {
        board = new Score[size];
    }

    public void addScore(Score score) {
        int newScore = score.score;

        if (playerNum < board.length || newScore > board[playerNum-1].score){
            if(playerNum < board.length)
                playerNum++;

            int temp = playerNum-1;

            while (temp > 0 && board[temp -1].score < newScore){
                board[temp] = board[temp-1];
                temp--;
            }
            board[temp] = score;
        }
    }

    public void printScore() {

        if (board != null){
            for (Score score : board){
                System.out.println("Name : " + score.name + "Score : " + score.score);
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
