import java.util.*;

public class problems {

     public static void main(String[] args)
      {
          Scanner sc = new Scanner(System.in);
          // int a=sc.nextInt();
          // System.out.println("value of a is :" + a);
          // int b=sc.nextInt();
          // System.out.println("value of b is :" + b);
          // int c=sc.nextInt();
          // System.out.println("value of c is" +c);
          // System.out.println("sum of a and b is : " + (a+b+c));
          // System.out.println("product of a and b is :" + (a*b*c));
          // System.out.println("average of a & b and c is :" + (a+b+c)/3);

          // //area of circle & area of sqaure
          // int r=sc.nextInt();
          // double area=(3.14)*r*r;
          // System.out.println("area of square is " + (r*r));
          // System.out.printf("Area of Circle is : ",area);

          // largest among 3
          // int a = sc.nextInt();
          // int b = sc.nextInt();
          // int c = sc.nextInt();
          // if (a >= b) {
          //      System.out.println("a is largest");
          // }
          //  else if(b>=c){
          //      System.out.println("b is largest");
          // }
          //      else
          // {
          //     System.out.println("c is largest"); 
          // }

          //income tax
          int income=sc.nextInt();
          int tax=0;
          // float tax=sc.nextFloat();
          if (income<500000) {
               tax=0;
          }
          else if (income>=50000 && income<100000) {
               tax=(int)(income*0.2);
          } else {
               tax=(int)(income*0.3);
          }
          System.out.println("your tax is :" + tax);

     }

}
