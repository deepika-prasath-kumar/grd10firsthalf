import java.util.*;
public class nopnor
{
    public static void main(String[]args)
    {
      
    }
    static void three(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you would like the tables up till.");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i*3+" ");
        }
    }
}