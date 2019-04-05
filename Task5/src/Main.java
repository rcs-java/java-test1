import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cardnr;
        int i;
        int sum=0;
        int p1=0;
        int p2=02;

        cardnr=sc.nextLine();
        for (i = 0; i < (cardnr.length()-1); i++) {
            if ((Character.isDigit(cardnr.charAt(i)))&&(Character.isDigit(cardnr.charAt(i+1)))) {
                p1 = Character.getNumericValue(cardnr.charAt(i));
                p2 = Character.getNumericValue(cardnr.charAt(i+1));
                if (p1 == p2) {
                    sum = sum + p1;
                }
            }

        }
        System.out.println(sum);
    }


}

