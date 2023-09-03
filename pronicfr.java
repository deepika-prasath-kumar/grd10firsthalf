import java.util.*;
public class pronicfr
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if pronic or not:");
        int n=sc.nextInt();
        int result=pronic(n);
        if(result==1){
            System.out.println("The number is pronic:");
        }
        else{
            System.out.println("The number is not pronic");
        }
    }
    static int pronic(int s){
        for(int i=1;i<s;i++){
            if(i*(i+1)==s){
                return(1);
            }
        }
        return(0);
    }
}