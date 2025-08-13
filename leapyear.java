// Any year  is input throught the keyboard . write a program to determine whether the year is a leap year or not .
package condition;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        if(n%4==0){
            System.out.println(" the year ie leap year");
        }
        else{
            System.out.println(" the number is not leap year");
        }

    }
}
