import java.util.*;
public class bubblestring
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String n[]=new String[10];
        System.out.println("Enter the values of 10 names:");
        for(int i=0;i<10;i++)
        {
            n[i]=sc.next();
        }
        String temp=" ";
        for(int i=0;i<10;i++){
            for(int j=0;j<(9-i);j++){
                if(n[j].compareTo(n[j+1])>0){
                    temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
        System.out.println("The array in ascending order is:");
        for(int i=0;i<10;i++){
            System.out.print(n[i]+" ");
        }
    }
}