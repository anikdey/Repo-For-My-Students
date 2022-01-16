package fahmida.gameProject.linkedListBased;

import org.w3c.dom.Node;

public class GameBoard {

    private Node head;
    private int size = 0;

    private class Node{
        Score score;
        Node address;

        public Node(Score score,Node address){
            this.score = score;
            this.address = address;
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addScore(Score score){
        if(isEmpty()){
            head = new Node(score,null);
        }
        else if(head.score.getScore() < score.getScore()){
            head = new Node(score,head);
        }
        else{
            Node temp = head;
            Node prev = null;
            while (temp != null && temp.score.getScore() > score.getScore()){
                prev = temp;
                temp = temp.address;
            }
            if(prev.address == null){
                prev.address = new Node(score,null);
            }
            else{
                prev.address = new Node(score,temp);
            }
        }
        size++;
    }

    public Score remove(int index){
        Score score;
        if(index < 0 || isEmpty() || index > size){
            System.out.println("No score found to that index");
            return null;
        }
        if(index == 0){
            score = head.score;
            head = head.address;
        }
        else {
            int count = 0;
            Node temp = head;
            Node prev = null;

            while (count != index - 1){
                prev = temp;
                temp = temp.address;
                count++;
            }
            score = temp.score;
            prev.address = temp.address;
        }
        size--;
        return score;
    }

    public void printGameBoard(){
        if (isEmpty()){
            System.out.println("Score board is empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            Score score = temp.score;
            System.out.println("Name:" + score.getName()+", score:" + score.getScore());
            temp = temp.address;
        }
        System.out.println();
    }
    private static Score getScoreObject(String name, int score){
        return new Score(name,score);
    }

    public static void main(String[] args) {
        GameBoard gm = new GameBoard();

        gm.addScore(getScoreObject("sumaiya",23));
        gm.addScore(getScoreObject("lima",28));
        gm.addScore(getScoreObject("ishita",20));
        gm.addScore(getScoreObject("oishi",22));
        gm.addScore(getScoreObject("rahi",21));
        gm.addScore(getScoreObject("atiya",32));
        gm.printGameBoard();
        gm.remove(3);
        System.out.println("After removing score");
        gm.printGameBoard();
    }

}
