package condition;
// given the length and breath of a rectangle ,wriite a program to find either area of rectangle is greater than perimeter
import java.util.Scanner;

public class areaperimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter length:");
        int length = sc.nextInt();
        System.out.println(" enter breadth:");
        int breadth = sc.nextInt();
        int area = length * breadth ;
        int perimeter = 2 * length + 2 * breadth;
        if(area > perimeter){
            System.out.println(" Area is greater than perimeter ");
        }
        else{
            System.out.println(" perimeter is greater than area  ");
        }

    }
}
