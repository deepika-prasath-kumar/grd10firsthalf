import java.util.*;
public class nopwr
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("i am a barbie girl.");
        int ret=withreturn();
        if(ret==1){
            System.out.println("I am a gummy bear");
        }
        else{
           System.out.println("I am not a gummy bear"); 
        }
    }
    static int withreturn(){
        System.out.println("I am not a barbie girl");
        return(1);
    }
}