import java.util.*;
public class primecomp
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if its prime or composite");
        int s=sc.nextInt();
        int result=total_No_Factors(s);
        if(result==2){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is composite");
        }
    }
    static int total_No_Factors(int n){
        int count=0;
       for(int i=1;i<=n;i++)
       {
           if(i%n==0)
           {
               count++;
           }
       }
       return(count);
    }
}