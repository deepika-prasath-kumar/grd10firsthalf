import java.util.*;
public class switchtemp
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a for celcius to farenheight and b for farenheight to celcius:");
        char swit=sc.next().charAt(0);
        switch(swit){
            case 'a':
                {
                    System.out.println("Enter the temprature in celcius");
                    double t=sc.nextDouble();
                    double result=Cel_to_Fah (t);
                    System.out.println("The temprature in farenheight is:"+result);
                    break;
                }
            case 'b':
                {
                    System.out.println("Enter the temprature in farenheight:");
                    double temp=sc.nextDouble();
                    double result2=Fah_to_Cel (temp);
                    System.out.println("The temprature in celcius is:"+result2);
                    break; 
                }
        }
    }
    static double Cel_to_Fah (double c)
    {
       double F=((9.0/5)*c) +32;
       return(F);
    }
    static double Fah_to_Cel(double f){
      double C=(5.0/9)*(f-32);
      return(C);
    }
}