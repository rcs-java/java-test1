import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int PeopleInside = 0;
        int PeopleinQueue = 0;

        System.out.println("Please input amount of people in the room:");
        PeopleInside = sc.nextInt();
        System.out.println("Please input amount of people in the queue:");
        PeopleinQueue = sc.nextInt();

        if ((100 - PeopleInside) >= PeopleinQueue) {
            System.out.println("Can fit");
        } else {
            System.out.println("Can't fit");
        }

        do {
            PeopleInside++;
            if (PeopleInside <= 100) {
                System.out.print(" |Can fit| ");
            } else {
                System.out.print(" |Can't fit| ");
            }
            PeopleinQueue--;
        } while (PeopleinQueue > 0);


    }
}
