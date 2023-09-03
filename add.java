import java.util.*;
public class add
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers, the first to be smaller than the second:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=sum(a,b);
        System.out.println("The sum is"+result);
    }
    static int sum(int x,int y){
        int sum=x+y;
        return(sum);
    }
    
}