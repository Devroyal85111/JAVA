import java.util.*;
public class positive
{
    public static void main(String args[]){
     int num;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the num");
     num=s.nextInt();
     if(num>0)
     {
        System.out.println("It is positive");
     } 
     else{
        System.out.println("It is Nagative");
     }
    }
}