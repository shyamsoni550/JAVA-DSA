import java.util.*;
public class ternary {
     public static void main(String[] args) {
          // ternary operator : used as 3 operands
          // syntax : variable=condition?statment1:statment2
          int number = 4;
          String type = ((number % 2) == 0) ? "even" : "odd";
          System.out.println(type);

          //problem: pass or fail
          Scanner sc=new Scanner(System.in);
          int marks=sc.nextInt();
          String result=(marks>=33)?"pass":"fail";
          System.out.println(result);
          
     }
}
