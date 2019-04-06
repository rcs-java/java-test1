import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int lenght = 0;
        char first, last;
        int sum = 0;
        boolean status=true;

        name = sc.next();
        name=name.toLowerCase();
        lenght = (int) name.length() / 2;
        sum = name.length();

        for (int i = 0; i < lenght; i++) {
            if (name.charAt(i) == name.charAt(sum-1)) {
                status = true;
                sum-=1;
            } else {
                status = false;
                break;
            }

        }
        if (status) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


}

