import  java.util.*;
public class ifelse2{
    public static void main(String[] args){
    int a,b;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number:-");
    a=s.nextInt();
    System.out.println("Enter the number:-");
    b=s.nextInt();
    if(a>b)
    {
        System.out.println(a+" maximum");
    }
    else{
        System.out.println(b+" maximum");
    }    
    }
}