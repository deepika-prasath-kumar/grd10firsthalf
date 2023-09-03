import java.util.*;
public class twoDrowscolumns{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of rows:");
      int r=sc.nextInt();
      System.out.println("Enter the number of columns:");
      int c=sc.nextInt();
      int sum=0;
      int array[][]=new int[r][c];
      System.out.println("Enter the numbers in your array:");
      for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
             array[i][j]=sc.nextInt(); 
          }
      }
      for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
             
             System.out.print(array[i][j]+" ");
             
          }
          
          System.out.println();
      }
      for(int j=0;j<c;j++)
      {
          for(int i=0;i<r;i++){
             sum=sum+array[i][j]; 
          }
          System.out.println("The sum column"+j+"is"+sum);
          sum=0;
      }
    }
}