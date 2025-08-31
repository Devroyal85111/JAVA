import  java.util.*;
public class special{
    public static void main(String args[]){
    char ch='*';
    if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
    {
        System.out.println("It is alphabats");    
    }
    else if(ch>='0' && ch<='9')
	{
			System.out.println("it is digit");
    }
	else
	{
			System.out.println("it is a special chracter");
    }
 }
}	