public class Stringdemoclass 
{

    public static void main(String[] args) 
    {
        /*  String : it is one of the prebuilt class in java.
          Different ways to define a String
          1. String literal
          2. By creating object of string

                                                

        String a = "Hello"; // this is how you can define string literals
        // in the above line the java will create a string object a and assign "hello" value to it
        String b = "Hello";
        // in the above line the java won't create separate object, instead it points to the
        // already existing object which holds the same value i.e. object a.
        String ab = new String("Hello"); // this is how you can define string with string class.
        String ac = new String("Hello");
        // in the above line eventhough there is object with hello string it will create a new object and assing "hello"
        //value to it, this is the major difference between the defining the string with string literal and string class.
*/

        String a = " Java/training";
        System.out.println(a.charAt(2));
        System.out.println(a.indexOf("t"));
        System.out.println(a.substring(4, 8));
        System.out.println(a.substring(5));
        System.out.println(a.concat(" Sachin teaches"));
        System.out.println(a.length());
        // To remove some whitespaces in the string use trim method.
        System.out.println(a.trim());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        //split to split a sting to 2 strings
        String str[] = a.split("/");
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(a.replace("t", "s"));


        
    }
    
}
