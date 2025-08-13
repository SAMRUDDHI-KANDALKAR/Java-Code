// if cost price and selling price of an item is  input throught keyboard , write a program determine whether a seller  has made a profit or incurred loss also determine how much profit he made  or losse he incurred

package condition;

import java.util.Scanner;

public class cpsp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  cost price : ");
        int cp = sc.nextInt();
        System.out.println("enter a selling price ");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println(" you made  a profit");
            System.out.println(sp-cp);
        }
        if (cp>sp){
            System.out.println(" you incurred a  loss");
            int loss = cp - sp ;
            System.out.println(loss);
        }


        int n = sc.nextInt();
    }
}
