import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
int capacity = 100;
            Scanner sc = new Scanner(System.in);
        System.out.println("please enter the amount of people in the room");
            int input1 = sc.nextInt();
        System.out.println("the amount of people still in the queue");
        int input2 = sc.nextInt();
        if (100-input1-input2>0){
            System.out.println("can fit");
        } else {
            System.out.println("can't fit");
        }



    }
}
