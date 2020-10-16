package kollatz;

import java.util.Scanner;

public class SimpleKollatz {
    public static void main(String[] args) {
        final int MAX_AMOUNT=200;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the initial number:");
        final int START=scanner.nextInt();
        int curr=START;
        System.out.println("The Collatz sequence is:");
        System.out.print(curr+" ");
        int n=2;
        for (; n <=MAX_AMOUNT ; n++) {
            if (curr%2==0) curr/=2;
            else curr=curr*3+1;
            System.out.print(curr+" ");
            if ((curr==1)&&(n>3)) {
                System.out.println(" Loop with 1");
                break;
            }
            if (n%10==0) System.out.println();
        }
        System.out.println("There were "+n
        +" numbers before stop");
    }
}
