package quiz1;

import java.util.Scanner;

public class Quiz1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Side1 ");
        double s1=sc.nextDouble();
        System.out.println("Enter Side2 ");
        double s2=sc.nextDouble();
        System.out.println("Enter Side3 ");
        double s3=sc.nextDouble();
        sc.close();
        
        Triangle t1=new Triangle(s1,s2,s3);
        if(t1.sidenonnegative())
        {
            System.out.println("Perimeter = "+t1.GetPerimeter()+"\nArea = "+t1.GetArea());
        }else{
            System.out.println("The sides have wrong values");
        }
         
    }
    
}
