package condition;

import java.util.Scanner;

public class greater3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter first number:");
        int a = sc.nextInt();
        System.out.println("enter second number :");
        int b = sc.nextInt();
        System.out.println(" enter third number :");
        int c = sc.nextInt();
        if (a > b) {

            if(a>c){
                System.out.println(" first is  greater number among three number ");
            }
            System.out.println("first number is greater among three number ");
        }
        if(b>a){
            if(b>c){
                System.out.println("second nmber is greater among three number");
            }
            System.out.println(" second number is greater among three number");
        }
        if(c>a){
            if(c>b){
                System.out.println(" third number s greater among these three number");
            }
            System.out.println(" third number is greater among these three number ");
        }
    }
}
