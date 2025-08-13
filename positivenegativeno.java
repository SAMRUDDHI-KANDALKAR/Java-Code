package condition;

import java.util.Scanner;

public class positivenegativeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number: ");
        int n = sc.nextInt();
        if(n>=0) {
            if(n==0) {
                System.out.println(" your number is zero");
            }
            else{
                System.out.println(" your number is positive");
            }


            }else{
            System.out.println(" your number is negative ");
        }




    }
}
