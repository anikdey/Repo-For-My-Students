package gameBoard;

import java.util.Scanner;

public class ScoreBoard {
    static Scanner input =new Scanner(System.in);
    static int index=0;
    private static ScoreEntry[] arr;


    public ScoreBoard(){
        arr = new ScoreEntry[5];
    }
    public ScoreBoard(int length){
        arr = new ScoreEntry[length];
    }

    public ScoreBoard(ScoreEntry entry) {

    }

    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();
        addEntry(10,"aa");
        addEntry(11,"bb");
        addEntry(13,"cc");
        addEntry(14,"dd");
        addEntry(15,"ee");
        showResult();
    }
    public static void addEntry(int score,String name){
//        System.out.println("enter member name");
//        String name =input.nextLine();
//        System.out.println("enter member score");
//        int score = input.nextInt();input.nextLine();

        ScoreEntry entry = new ScoreEntry(score,name);
        if (arr.length==index+1){
            sorting(entry);
        }else {
            arr[index] = new ScoreEntry(score,name);index++;
        }

    }
    public static void sorting(ScoreEntry entry){
        for (int i = 0; i <arr.length ; i++) {
            boolean check = false;
            for (int j = 0; j <arr.length-1-i ; j++) {

                if(arr[j].getScore()< entry.getScore()){
                    ScoreEntry temp =arr[j];
                    arr[j]=entry;
                    arr[j+1]=temp;check=true;
                }

            }
            if (!check){
                break;
            }
        }

    }
    public static void sorting(){
        for (int i = 0; i <arr.length ; i++) {
            boolean check = false;
            for (int j = 0; j <arr.length-1-i ; j++) {

                if(arr[j].getScore()< arr[j+1].getScore()){
                    ScoreEntry temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;check=true;
                }

            }
            if (!check){
                break;
            }
        }

    }

    public static void showResult(){
        sorting();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getScore()+" "+arr[i].getName());
        }
    }

}
