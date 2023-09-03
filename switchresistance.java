import java.util.*;
public class switchresistance
{
    public static void main(String[]argS)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter s for resistance of series and p for resistance of parallel");
        char rest=sc.next().charAt(0);
        System.out.println("Enter the value of R1");
        double r1=sc.nextInt();
        System.out.println("Enter the value of R2");
        double r2=sc.nextInt();
        double R=0;
        switch(rest)
        {
            case 's':
                R=r1+r2;  
                System.out.println("The resistance of series is"+R);
                break;
            case 'p':
                R=(r1*r2)/(r1+r2);
                System.out.println("The resistance of parallel is"+R);
                break;
        }
    }
}