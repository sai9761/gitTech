import java.util.*;
public class Palindrome
{
 public static void main(String args[])
 {
    int rev = 0;
    int m = 0;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
   int num = sc.nextInt();
    m = num;
    while(num != 0)
     {
        int r = num%10;
        rev = rev*10 + r;
        num = num/10;
    }

     if(m == rev)
       System.out.println("Number is same");
     else
       {
         System.out.println("Number is different");
       }

}
}

