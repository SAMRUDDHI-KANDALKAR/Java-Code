package condition;

import java.util.Scanner;

public class greaternum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a first number:");
        int a = sc.nextInt();
        System.out.println(" enter a second number :");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(" frist number is greater than second number ");

        }
        else{
            System.out.println(" second number is greater than first number ");
        }
    }
}
