import java.util.*;
public class twoDsquare{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the square matrix:");
      int r=sc.nextInt();
      int sum=0;
      int array[][]=new int[r][r];
      System.out.println("Enter the numbers in your array:");
      for(int i=0;i<r;i++){
          for(int j=0;j<r;j++){
             array[i][j]=sc.nextInt(); 
          }
      }
      for(int i=0;i<r;i++){
          for(int j=0;j<r;j++){
             sum=sum+array[i][j];
             System.out.print(array[i][j]+" ");
             
          }
          System.out.print("The sum row is"+sum);
          sum=0;
          System.out.println();
      }
    }
}