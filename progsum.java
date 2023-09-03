import java.util.*;
public class progsum
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[20];
        int even=0;
        int odd=0;
        System.out.println("Enter 20 numbers: ");
        for(int i=0;i<20;i++){
            array[i]=sc.nextInt();
        }
        for(int j=0;j<20;j++){
            System.out.print(array[j]+" ");
            if(j%2==0){
                even=even+array[j];
            }
            else{
                odd=odd+array[j];
            }
        }
        System.out.println("\nThe sum of even indexes are:"+even);
        System.out.println("The sum of odd indexes are:"+odd);
    }
}