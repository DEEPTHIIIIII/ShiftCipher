// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void caserEncrypt(String s,int key)
    {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
                res+=(char)(((s.charAt(i)-'A'+key)%26)+'A');
            else if(Character.isLowerCase(s.charAt(i)))
                res+=(char)(((s.charAt(i)-'a'+key)%26)+'a');
            else
                res+=s.charAt(i);
                
        }
        System.out.println("The resulting ciper text after encrypting is: "+res);
    }
    public static void caserDecrypt(String s,int key)
    {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
                res+=(char)(((s.charAt(i)-'A'-key)%26)+'A');
            else if(Character.isLowerCase(s.charAt(i)))
                res+=(char)(((s.charAt(i)-'a'-key)%26)+'a');
            else
                res+=s.charAt(i);
                
        }
        System.out.println("The resulting plain text after decrypting is: "+res);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Shift cipher encryption and decryption\nEnter 1 for encryption and 2 for decryption");
        int ch=sc.nextInt();
        sc.nextLine();
        if(ch==1)
        {
            System.out.println("Enter the plain text to obtain ciper text");
            String s=sc.nextLine();
            System.out.println("Enter the key value");
            int n=sc.nextInt();
            caserEncrypt(s,n);
        }
        else if(ch==2)
        {
            System.out.println("Enter the cipher text to obtain plain text");
            String s=sc.nextLine();
            System.out.println("Enter the key value");
            int n=sc.nextInt();
            caserDecrypt(s,n);
        }
        else{
            System.out.println("Improper choice");
        }
    }
}
