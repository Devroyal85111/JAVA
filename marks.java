import  java.util.*;
public class marks{
    public static void main(String[] args){
    int marks,Eng,Hinidi,Math,Computer,biology;
    Scanner s=new Scanner(System.in);
    
     System.out.println("\nEnter the Marks of Eng ");
     Eng=s.nextInt();
     System.out.println("Enter the Marks of Hinidi ");
     Hinidi=s.nextInt();     
     System.out.println("Enter the Marks of Math ");
     Math=s.nextInt();
     System.out.println("Enter the Marks of Computer ");
     Computer=s.nextInt();
     System.out.println("Enter the Marks o biology");
     biology=s.nextInt();
    marks=(Eng+Hinidi+Math+Computer+biology)/5;
    if(marks>=90)
    {
        System.out.println("A grade");
    }
    else if(marks>=80){
        System.out.println("B grade");
    }
    else if(marks>=70){
        System.out.println("C grade");
    }
    else if(marks>=60){
        System.out.println("D grade");
    }
    else if(marks>=50){
        System.out.println("E grade");
    }
    else{
        System.out.println("You are fail");
    }
 }
}