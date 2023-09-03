import java.util.*;
public class progfactorial
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int sum5=0;
        int fact=1;
        int array[]=new int[n];
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            
            System.out.print(array[i]+" ");
        }
        for(int i=0;i<n;i++)
        {
            fact=1;
            if(array[i]%5==0)
            {
                sum5=sum5+array[i];  
            }
            if(array[i]>=1&&array[i]<=7)
            {

                for(int j=1;j<=array[i];j++)
                {
                    fact=j*fact;

                }
                System.out.println("\nThe factorial of"+array[i]+"is"+fact);
            }
        }

        System.out.println("The sum of numbers divisible by 5 is:"+sum5);
    }
}