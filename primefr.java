import java.util.*;
public class primefr
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number to check if prime or not");
        int s=sc.nextInt(); 
        int result=prime(s);
        if(result==0){
            System.out.println("The number is prime");
            
        }
        else{
          System.out.println("The number is not prime");  
        }
    }
    static int prime(int n){
        
        int flag=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0){
               flag=1;
               break;
            }
        }
        return(flag);
    }
}