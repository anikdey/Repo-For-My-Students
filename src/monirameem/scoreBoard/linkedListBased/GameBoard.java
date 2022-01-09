package monirameem.scoreBoard.linkedListBased;

public class GameBoard {

    Node<Score> board = null;

    int lastPlayer = 0;

    public void addScore(int data) {

        if (board == null){
            board = new Node(data,null);
        }
    }


    static class Node<Score> {

        Node<Score> next;
        Score score;
        Node(Score score,Node<Score> next){
            this.next = next;
            this.score = score;
        }
    }
}
