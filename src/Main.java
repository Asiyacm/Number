import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        do {
            System.out.println("Choose the opertion");
            System.out.println("\n1.Largest\n2.Smallest\n3.Prime\n4.Even or not\n5.Reverse\n6.Exit");
            Scanner xy = new Scanner(System.in);
            option = xy.nextInt();
            switch (option) {
                case 1:

                    System.out.println("Enter First Number");
                    float First = xy.nextInt();
                    System.out.println("Enter Second Number");
                    float Second = xy.nextInt();
                    System.out.println("Enter Second Number");
                    float Third = xy.nextInt();
                    if (First > Second && First > Third) {
                        System.out.println("Largest number is :" + First);
                    } else if (Second > Third) {
                        System.out.println("Largest number is :" + Second);
                    } else {
                        System.out.println("Largest number is :" + Third);
                    }

                    break;
            }
        }while (option != 6);
    }
}