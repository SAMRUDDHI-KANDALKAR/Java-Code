package condition;

import java.util.Scanner;

public class squreornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter length : ");
        int l = sc.nextInt();
        System.out.println(" enter bredth ");
        int b = sc.nextInt();

        if(l==b){
            System.out.println(" the enter shape is squre");
        }
        else{
            System.out.println(" the enter shape is not squre ");
        }
    }
}
