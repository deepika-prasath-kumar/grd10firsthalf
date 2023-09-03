import java.util.*;
public class progsquares
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[8];
        System.out.println("Enter 8 numbers: ");

        for(int i=0;i<8;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Index"+" Element"+" Square");
        for(int i=0;i<8;i++){
            System.out.print(i+"  "+array[i]+"  " + (array[i]*array[i]));
            System.out.println();
        }
    }
}