package saccha.gameBoard;

public class GameBoardLinkedList {

    private Node head;
    private int size=0;

    public boolean isEmpty(){
        return size==0;
    }
    public void addScore(ScoreEntry entry){
        if(isEmpty()) {
            head = new Node(entry, null);
        } else if(head.entry.getScore()<entry.getScore()) {
            head = new Node(entry, head);
        } else {
            Node temp = head;
            Node prev = null;
            while (temp != null && temp.entry.getScore()>entry.getScore()) {
                prev = temp;
                temp = temp.next;
            }
            if(prev.next == null) {
                prev.next = new Node(entry, null);
            } else {
                prev.next = new Node(entry, temp);
            }
        }
        size++;
    }

    public static ScoreEntry getEntryObject(String name,int score){
        return new ScoreEntry(name,score);
    }

    public ScoreEntry removeEntry(int index){
        ScoreEntry data;
        if(index<0 || isEmpty() || index>size) {
            System.out.println("No data exist in ths index");
            return null;
        }
        if(index == 0) {
            data = head.entry;
            head = head.next;
        } else {
            int count = 0;
            Node temp = head;
            Node prev = null;
            while (count != index-1) {
                prev = temp;
                temp = temp.next;
                count++;
            }
            data = temp.entry;
            prev.next = temp.next;
        }
        size--;
        return data;
    }

    public void printBoard(){
        if(isEmpty()) {
            System.out.println("no data exist on this board");
            return;
        }

        Node temp = head;
        int count = 1;
        while (temp != null) {
            ScoreEntry data = temp.entry;
            System.out.println((count+" name: "+data.getName()+" score: "+data.getScore()));
            count++;
            temp = temp.next;
        }
        System.out.println("================");
    }

    public static void main(String[] args) {
        GameBoardLinkedList board = new GameBoardLinkedList();

        board.addScore(getEntryObject("player 1",50));
        board.addScore(getEntryObject("player 2",60));
        board.addScore(getEntryObject("player 3",70));
        board.addScore(getEntryObject("player 4",80));
        board.addScore(getEntryObject("player 5",90));
        board.addScore(getEntryObject("player 6",100));
        board.addScore(getEntryObject("player 7",110));
        board.printBoard();
        int index = 5;
        System.out.println("after removing data from "+index+" index");
        board.removeEntry(index);
        board.printBoard();
    }



    public class Node{
        ScoreEntry entry;
        Node next;

        public Node(ScoreEntry entry,Node next){
            this.entry=entry;
            this.next=next;
        }
    }
}



