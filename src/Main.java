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
                case 2:

                    System.out.println("Enter First Number");
                    float a = xy.nextInt();
                    System.out.println("Enter Second Number");
                    float b = xy.nextInt();
                    System.out.println("Enter Second Number");
                    float c = xy.nextInt();
                    if (a < b && a < b) {
                        System.out.println("Smallest number is :" + a);
                    } else if (b < c) {
                        System.out.println("Smallest number is :" + b);
                    } else {
                        System.out.println("Smallest number is :" + c);
                    }

                    break;
                case 3:

                    System.out.println("Enter the Number");
                    float n = xy.nextInt();
                    float ab = n/2;
                    if(ab==0||ab==1){
                        System.out.println(n+" is not prime number");
                    }else{
                        for(int i=2;i<=ab;i++){
                            int flag;
                            if(n%i==0){
                                System.out.println(n+" is not prime number");
                               flag=1;
                                break;
ver                            }

                        else{
                            System.out.println(n+" is prime number");
                            }
                        }
                    }

                    break;
                case 4:

                    System.out.println("Enter the Number");
                    float p = xy.nextInt();
                    if(p % 2 == 0){
                        System.out.println("Even number");
                    }else {
                        System.out.println("Not Even number");
                    }
                                break;
                    case 5:

                        System.out.println("Enter the Number");
                        int r = xy.nextInt();
                        int rem;
                        int rev=0;
                        while(r > 0)
                        {
                            rem = r % 10;
                            rev = (rev * 10) + rem;
                            r = r/10;
                        }
                        System.out.println("The reverse of the given number is: " + rev);
                        break;
                case 5:

                    System.out.println("Enter exit");
                    break;
                default:

                    System.out.println("Invalid choice");
                    break;

            }



        }while (option != 6);


    }
}