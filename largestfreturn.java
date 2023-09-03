import java.util.*;
public class largestfreturn
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 integers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        int result=min(a,b,c);
        int resultmax=max(a,b);
        System.out.println("The minimum of 3 numbers is"+result);
        System.out.println("The max of 2 numbers is"+resultmax);
    }
    static int min(int x, int y,int z){
        int mimi=Math.min(x,(Math.min(y,z)));
        return(mimi);
    }
    static int max(int x, int y){
        int max=Math.max(x,y);
        return(max);
    }
}