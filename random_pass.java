import java.util.Random;

public class random_pass {
    public static void main(String args[])
    {
        int length=10;
        System.out.println(new_password(length));
    }
    static char[] new_password(int len)
    {
        System.out.println("Generating a random password");
    
       System.out.print("Your new password is: ");
       String Captipal_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String Small_chars = "abcdefghijklmnopqrstuvwxyz";
       String numbers = "0123456789";
       String symbols = "!@#$%^&*()_-+=/.<>?";
       String value = Captipal_chars + Small_chars + numbers + symbols;
       Random r=new Random();
       char[] password =new char[len];
       for(int i=0;i<len;i++)
       {
           password[i]=value.charAt(r.nextInt(value.length()));
       }
       return password;
    }
}
