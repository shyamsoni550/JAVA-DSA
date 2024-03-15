import java.util.*;
public class conditional 
{
     public static void main(String[] args)
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter your age:");
          int age=sc.nextInt();
          if (age>=18) {
               System.out.println("adult:drive,vote" );
          }
          else
          {
               System.out.println("children ");
          }

          //positive or negative
          System.out.println("enter number");
          int num=sc.nextInt();

          if (num>0) {
               System.out.println("number is positive");
          }
          else if (num<0) {
               System.out.println("number is negative");
          }
          else
          {
               System.out.println("number is zero");
          }
          
          double temp=103.5;
          if(temp>=100)
          {
               System.out.println("you have an fever");
          }
          else
          {
               System.out.println("you dont have an fever");
          }
     }
}



