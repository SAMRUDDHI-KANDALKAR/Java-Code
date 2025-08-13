//   tske the positive no input check the enter no is  even or odd .
package condition;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        System.out.println(n*n);
        if(n%2==0){
            System.out.println("number is even");
            //code 4%2=0

        }
        else{
            System.out.println(" number is odd ");
            System.out.println("good evening");

        }

    }
}
