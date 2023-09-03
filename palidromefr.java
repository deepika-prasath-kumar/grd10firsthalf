import java.util.*;
public class palidromefr
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if palidrome or not");
        int s=sc.nextInt();
        int result=palidrome(s);
        if(result==s){
           System.out.println("The number is a palindrome"); 
        }
        else{
           System.out.println("The number is not a palindrome");  
        }
    }
    static int palidrome(int n){
        int n1=0;
        int rev=0;
        while(n>0){
            n1=n%10;
            rev=rev*10+n1;
            n=n/10;
        }
        return(rev);
    }
}