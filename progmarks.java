import java.util.*;
public class progmarks{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[5];
        System.out.println("Enter marks for 5 subjects");
        int total=0;
        int avg=0;
        for(int i=0;i<5;i++){
        marks[i]=sc.nextInt();
    }
    for(int i=0;i<5;i++){
       total=total+marks[i];
    }
    avg=total/5;
    System.out.println("The total marks is: "+total);
    System.out.println("The average marks is: "+avg);
}
}