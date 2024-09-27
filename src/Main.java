import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int  total_perchase=100;

        final byte MOUNTS_IN_YEAR = 12;
        final byte PERCENT=100;



        System.out.print(" Principal: " );
        int principal=input.nextInt();
        System.out.print(" Annual Interest Rate: " );
         float interestRate=input.nextFloat();
        float mounthlyInterest= (interestRate/PERCENT)/MOUNTS_IN_YEAR;

        System.out.print(" Period(Years): " );
         byte  period=input.nextByte();
         int numberOfPayment= period * MOUNTS_IN_YEAR;


       double mortgage=principal*(mounthlyInterest *Math.pow(1+mounthlyInterest,numberOfPayment))/(Math.pow(1+mounthlyInterest, numberOfPayment)-1);

       NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Mortgage: " + formatter.format(mortgage));





















    }
}