import java.util.*;
public class pellnumber
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you would like the series till:");
        int s=sc.nextInt();
        PellSeries(s);
    }
    static void PellSeries(int n)
    {
        int a=1;
        int b=2;
        int i=0;
        int pell=0;
        System.out.println("The pell numbers are:");
        System.out.print(a+" "+b+" ");
        while(i<n-2){
            pell=(2*b)+a;
            i++;
            System.out.print(pell+" ");
            a=b;
            b=pell;
            
        }
        
    }
}