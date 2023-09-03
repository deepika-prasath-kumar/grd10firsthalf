import java.util.*;
public class factors
{

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        factors(a);
    }

    public static void factors(int n){
        int fact=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                fact++;
            }
        }
        System.out.println("The number of factors"+n+"has is "+fact);
    }
}