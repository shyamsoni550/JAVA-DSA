import java.util.*;

public class calculator {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the first number:");
          double num1 = sc.nextDouble();
          System.out.println("Enter the second number:");
          double num2 = sc.nextDouble();
          System.out.println("enter operator:");
          char operator = sc.next().charAt(0);
          switch (operator) {
               case '+':
                    System.out.println(num1 + num2);
                    break;
               case '-':
                    System.out.println(num1 - num2);
                    break;
               case '*':
                    System.out.println(num1 * num2);
                    break;
               case '/':
                    System.out.println(num1 / num2);
                    break;
               case  '%':
               System.out.println(num1%num2);
               break;
               default:
                    System.out.println( "invalid");
                    break;
          }

     }
}
