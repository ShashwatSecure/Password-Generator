import java.util.*;

public class PasswordGenerator
{
    static String Generate(int len)
    {
        Random r = new Random();
        String Characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String password = "";

        for(int i=0;i<len;i++)
        {
            password += Characters.charAt(r.nextInt(Characters.length()));//fetching the character at a random index in Characters
        }
        return password;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the password to be generated : ");
        int len = sc.nextInt();

        System.out.println("Generated Password : "+Generate(len));
        sc.close();
    }
}