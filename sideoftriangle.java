package condition;

import java.util.Scanner;

public class sideoftriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println(" Enter  first number : ");
        int a = sc.nextInt();
        System.out.println(" Enter second number : ");
        int b = sc.nextInt();
        System.out.println(" Enter third number : ");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println(" Valid triangle ");
        }
        else{
            System.out.println(" Invalid triangle ");
        }
    }
}
