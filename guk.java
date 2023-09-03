import java.util.*;
public class guk {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        int sumrow=0;
        int sumcolumn=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                sumrow=sumrow+array[i][j];
            }
            System.out.println("The sum of row "+ i+" is "+ sumrow);
            sumrow=0;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                sumcolumn=sumcolumn+array[j][i];
            }
            System.out.println("The sum of column "+ i+" is "+ sumcolumn);
            sumcolumn=0;
        }
        int leftd=0;
        int rightd=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                if(i==j){
                    leftd=leftd+array[i][j];
                }
                if(i+j==n-1){
                    rightd=rightd+array[i][j];
                }
            }
            
        }
        System.out.println("The sum of left diagnol is"+leftd);
        System.out.println("The sum of right diagnol is"+rightd);
    }
    
}