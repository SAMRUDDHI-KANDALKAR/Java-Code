package condition;

import java.util.Scanner;

public class gradesystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter marks of student :");
        int n = sc.nextInt();
        if(n>=90){
            System.out.println(" he have  A  Grade ");
        }
        if(n>=80){
            System.out.println(" he have B Grade");



        }
        if(n>=70) {
            System.out.println(" he have C grade");
        }
    }
}
