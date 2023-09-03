import java.util.*;
public class employeealowance
{
    public static void main(String[]argS)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.next();
        System.out.println("Enter the basic salary you recieve:");
        int bs=sc.nextInt();
        double gs=0;
        double da=0;
        double sa=0;
        if(bs<=10000){
            da=10/100.0*bs;
            sa=5/100.0*bs;
            gs=bs+da+sa;
        }
        else if(bs<=20000){
            da=12/100.0*bs;
            sa=8/100.0*bs;
            gs=bs+da+sa;
        }
        else if(bs<=30000){
            da=15/100.0*bs;
            sa=10/100.0*bs;
            gs=bs+da+sa;
        }
        else {
            da=20/100.0*bs;
            sa=12/100.0*bs;
            gs=bs+da+sa;
        }
        System.out.println(" Name   Basic   DA   Spl.allowance   Gross salary");
        System.out.println(name+"  "+bs+"   "+da+"     "+sa+"      "+gs);
    }
}