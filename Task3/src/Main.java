import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int fibo1=1;
        int fibo2=1;
        int fibo=1;
        int i=0;
        System.out.println("1) "+fibo1);
        System.out.println("2) "+fibo2);
        for (i=3; i<=40; i++) {
            fibo=fibo1+fibo2;
            System.out.println(i+") "+fibo);
            fibo1=fibo2;
            fibo2=fibo;

        }


    }
}
