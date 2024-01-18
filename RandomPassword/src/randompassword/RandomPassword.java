package randompassword;
import java.util.Scanner;
import java.util.Random; 
public class RandomPassword 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            int len;
            System.out.println("Random Password Generator");
            System.out.println("Enter the desired length of password: ");
            len=sc.nextInt();
            String upperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lowerCase="abcdefghijklmnopqrstuvwxyz";
            String num="0123456789";
            String spclChar="!@#$%^&*-+=,.<>/";
            String combination=upperCase+lowerCase+spclChar+num;
            
            StringBuilder password=new StringBuilder();
            
            Random r=new Random();
            
            for(int i=0;i<len;i++)
            {
                char add=combination.charAt(r.nextInt(combination.length()));
                password.append(add);
            }
            System.out.println("The Random Generated Password : "+password);
        }
    }
    
}
