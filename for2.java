import java.util.*;
public class for2{
    public static void main(String[] args){
        int i,num;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the num:-");
        num = s.nextInt();
        for(i=num;i>=1;i--)
        {
            if(i%2==1)
            {
                System.out.print(i+"\teven");
            }
        }
    }
}