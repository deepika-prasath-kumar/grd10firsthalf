import java.util.*;
public class bubblesort
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[10];
        System.out.println("Enter 10 values");
        for(int i=0;i<10;i++){
            array[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<(9)-i;j++){
              if(array[j]>array[j+1]){
                  temp=array[j];
                  array[j]=array[j+1];
                  array[j+1]=temp;
              }
            }
        }
        System.out.println("The array in ascending order is: ");
        for(int i=0;i<10;i++){
            System.out.print(array[i]+" , ");
        }
    }
}