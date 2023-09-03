import java.util.*;
public class factorialfr
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int s=factorial(a)/factorial(b)*factorial(a-b);
        System.out.println(s);
    }
    static int factorial(int x){
        int fact=1;
        for(int i=1;i<=x;i++){
            fact=fact*i;
        }
        return(fact);
    }
}