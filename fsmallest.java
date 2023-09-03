import java.util.*;
public class fsmallest{

    public static void main()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number:");
      int a=sc.nextInt();
      System.out.println("Enter the second number:");
      int b=sc.nextInt();
      System.out.println("Enter the third number:");
      int c=sc.nextInt();
      min(a,b,c);
    }
    public static void min(int x,int y,int z){
        int min=Math.min(x,Math.min(y,z));
        System.out.println("The smallest no is:"+ min);
    }
}