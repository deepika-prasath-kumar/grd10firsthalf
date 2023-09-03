import java.util.*;
public class armstrongf
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if its armstrong:");
        int s=sc.nextInt();
        armstrong(s);
    }
    static void armstrong(int n){
        int sum=0;
        int n1=0;
        int compare=n;
        while(n>0){
            n1=n%10;
            sum=sum+n1*n1*n1;
            n=n/10;
        }
        if(sum==compare){
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("The number is not an armstrong number");
        }
    }
}