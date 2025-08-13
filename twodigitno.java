package condition;
// take a input 2 digit and tell it is 2 digit or not .

import java.util.Scanner;

public class twodigitno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a number :");
        int n = sc.nextInt();
        if(n>=10 && n<=99){
            System.out.println(" The given number  is two digit number ");
        }
        else{
            System.out.println(" The given number is not two digit number");

        }




    }



}
