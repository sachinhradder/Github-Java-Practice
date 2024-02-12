public class Reversingstring 
{
    public static void main(String[] args) 
    {

        // Print the given string in reverse order
        // check wether the given string is palindrome or not
        String s = "madam";
        String t = "";

        for (int i=s.length()-1; i>=0; i--)
        {
            t = t + s.charAt(i);
            //System.out.println(s.charAt(i));
        }
        System.out.println(t);

        if(t==s)
        {
            System.out.println("The given string is a palindrome");
        }
        else
        {
            System.out.println("The given string is not a palindrome");
        }
    }
    
}
  //t = gadaG