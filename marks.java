import  java.util.*;
public class marks{
    public static void main(String[] args){
    int marks,Eng,hinidi,math,computer;
    Scanner s=new Scanner(System.in);
    Scanner s=new Scanner(System.in);
     System.out.println("\nEnter the Marks of Eng "); 
     System.out.println("Enter the Marks of hinidi ");     
     System.out.println("Enter the Marks of math ");
     System.out.println("Enter the Marks of computer ");
    if(marks>=90)
    {
        System.out.println("A grad");
    }
    else if(marks>=80){
        System.out.println("B grad");
    }
    else if(marks>=70){
        System.out.println("C grad");
    }
    else if(marks>=60){
        System.out.println("D grad");
    }
    else if(marks>=50){
        System.out.println("E grad");
    }
    else{
        System.out.println("You are fail");
    }
 }
}