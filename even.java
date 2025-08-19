import  java.util.*;
public class even{
    public static void main(String[] args){
    int num;
     Scanner s=new Scanner(System.in);
    System.out.println("Enter the number:-");
    num=s.nextInt();
    if(num%2==0)
    {
        System.out.println("This is Even");
    }
    else{
        System.out.println("This is odd");
    } 
}
}