package Assignments;
import java.util.Scanner;
public class Assignment2 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            Assignment2 as=new Assignment2();
            as.largestOfThree(a,b,c);
        }

    }
    
    public void largestOfThree(int a,int b,int c)
    {
        if(a>b && a>c)
        {
            System.out.println(a+" is the largest number");
        }
        else if(b>a && b>c){
            System.out.println(b+" is the largest number");
        }
        else{
            System.out.println(c+" is the largest number");
        }

    }
}
    

