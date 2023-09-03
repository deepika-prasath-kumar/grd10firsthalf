import java.util.*;
public class progsales
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int sales[]=new int[7];
        System.out.println("Enter the sales for each day of the week");
        int total=0;
        int avg=0;
        for(int i=0;i<7;i++){
            sales[i]=sc.nextInt();
        }
        for(int i=0;i<7;i++){
            total=total+sales[i];
        }
        avg=total/7;
        System.out.println("The total sales of the week is: "+total);
        System.out.println("The avg sales of the week is: "+avg);
    }
}