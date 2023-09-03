import java.util.*;
public class factorsfr
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int result=factors(n);
        System.out.println("The number of factors is"+result);
    }
    static int factors(int s){
        int count=0;
        for(int i=2;i<s;i++){
            if(s%i==0){
                count++;
            }
        }
        return(count);
    }
}