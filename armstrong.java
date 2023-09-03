import java.util.*;
public class armstrong
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find out if its armstrong or not:");
        int s=sc.nextInt();
        int ret=armstrong(s);
        if(ret==1){
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("The number is not armstrong:");
        }
    }
    static int armstrong(int n)
    {
        int armstrong=0;
        int n1=0;
        int number=n;
        while(n!=0){
            n1=n%10;
            armstrong=armstrong+n1*n1*n1;
            n=n/10;
        }
        if(number==armstrong){
            return(1);
        }
        else{
            return(0);
        }
    }
}