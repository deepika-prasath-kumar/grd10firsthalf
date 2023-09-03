import java.util.*;
public class armstrongfr
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if its armstrong:");
        int s=sc.nextInt();
        int result=armstrong(s);
        if(result==1){
            System.out.println("The number is armstrong");
        }
        else{
           System.out.println("The number is not armstrong"); 
        }

    }
    static int armstrong(int n){
        int sum=0;
        int n1=0;
        int compare=n;
        while(n>0){
            n1=n%10;
            sum=sum+n1*n1*n1;
            n=n/10;
        }
        if(sum==compare){
            return(1);
        }
        else{
            return(0);
        }
        
    }
}