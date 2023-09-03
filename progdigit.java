import java.util.*;
public class progdigit
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int array[]=new int[n];
        int singlesum=0;
        int doublesum=0;
        System.out.println("Enter the numbers:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(array[i]>=0&&array[i]<10){
                singlesum=singlesum+array[i];
            }
            if(array[i]>=10&&array[i]<100){
                doublesum=doublesum+array[i];
            }
        }
        System.out.println("The sum of single digit numbers is"+singlesum);
        System.out.println("The sum of double digit numbers is"+doublesum);
    }
}