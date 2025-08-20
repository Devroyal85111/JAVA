import  java.util.*;
public class max{
    public static void main(String[] args){
    int a,b,c;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number:-");
    a=s.nextInt();
    System.out.println("Enter the number:-");
    b=s.nextInt();
    System.out.println("Enter the number:-");
    c=s.nextInt();
    if(a>b && a>c)
    {
       
            System.out.println(a+" max");
    }
    else if(b>a && b>c)
    {
        System.out.println(b+"max");
    }
    else{
        System.out.println(c+" max");
    }    
    }
}