package condition;
//Check if person is eligible to vote (age ≥ 18).

import java.util.Scanner;

public class votingagecriteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your age for voting criteria : ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println( " your age is  eligible for voting criteria ");
        }
        else{
            System.out.println(" your age is not eligible for voting criteria ");
        }

    }
}
