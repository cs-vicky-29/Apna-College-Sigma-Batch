// Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
// these 3 numbers.
// (Hint : Average of N numbers is sum of those numbers divided by N)
import java.util.*;
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Three Number's: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=a+b+c;
        int Avg=sum/3;
        System.out.println(Avg);
        sc.close();
    }
    
}
