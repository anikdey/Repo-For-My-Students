package monirameem.scoreBoard.linkedListBased;

public class GameBoard {

    Node head = null;
    int lastPlayer = 0;
    int size = 0;

    public void addScore(Score newScore) {

        if (head == null){
            head = new Node(newScore,null);
        } else if (head.score.score < newScore.score){
            head = new Node(newScore,head);
        } else {
            Node temp = head;
            Node prev = null;

            while (temp != null && head.score.score > newScore.score){
                prev = temp;
                temp = temp.next;
            }

            if (prev.next == null){
                prev.next = new Node(newScore,null);
            } else {
                prev.next = new Node(newScore,temp);
            }
        }
        size++;
    }

    public Score remove(int index) {
        Score temp;

        if (index < 0 || isEmpty() || index > size){
            System.out.println("Invalid index");
            return null;
        }

        if (index == 0){
            temp = head.score;
            head = head.next;
        } else {
            int count = 0;
            Node present = head;
            Node prev = null;

            while (count != index -1){
                prev = present;
                present = present.next;
                count++;
            }
            temp = present.score;
            //assert prev != null;
            prev.next = present.next;
        }
        size--;
        return temp;
    }

    public void printBoard() {

        if (isEmpty()){
            System.out.println("The board is empty");
            return;
        }

        Node temp = head;
        while (temp != null){
            System.out.println("Name : " + temp.score.name + " Score : " + temp.score.score);
            temp = temp.next;
        }
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {

        GameBoard board = new GameBoard();
        board.addScore(new Score("meem",10));
        board.addScore(new Score("mina",20));
        board.addScore(new Score("amena",30));
        board.addScore(new Score("tumpa",50));

        board.printBoard();

    }

    static class Node {

        Node next;
        Score score;
        Node(Score score,Node next){
            this.next = next;
            this.score = score;
        }
    }
}
