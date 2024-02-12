public class Stringinjava 
{

    public static void main(String[] args) 
    {
        String a = "hello";
        String b = "hello"; // here since the content is same it won't create new object it will point to existing object i.e. a.
        a.concat("World");
        System.out.println(a);// output of this is "hello" not "hello world"
        //since the String b is also pointing to same object a, in this case the stirng is immutable can't change the value.
        String c = a.concat("world");// this will work but you can't change the value of the original string.
        System.out.println(c);

        System.out.println(a.equals(b));//true since content is same
        System.out.println(a==b);//true since both are refering to same object.
       
        String s = new String("hello");
        String s1 = new String("hello"); // even though the content of both the string are same it will create new object with value hello.
        
        System.out.println(a.equals(s));// this returns true since equals operator check for content match.
        System.out.println(a==s);// this will return false since both are refering to different objects.
        System.out.println(s==s1);// fail reference are different as they are defined with string class.

        // one can change the value of the original string using Stringbuilder and Stringbuffer classes both are mutable.
            StringBuffer sb = new StringBuffer("hello");
            sb.append("world");
            System.out.println(sb);
            sb.insert(2, "she");//heshelloworld
            System.out.println(sb);
            sb.replace(5, 7, "aa");//hesheaaoworld
            System.out.println(sb);
            sb.deleteCharAt(12);//hesheaaoworl
            System.out.println(sb);
            sb.reverse();
            System.out.println(sb);//lrowoaaehseh


            /*Stringbuilder and Stringbuffer offers same features the difference between them is 
              Stringbuilder is not thread safe while Stringbuffer is thread safe.
              Stringbuilder is non synchronized  while Stringbuffer is synchronized.
              Stringbuilder is faster then Stringbuffer due to thread safe features Stringbuffer is comparetevely slower
              then Stringbuilder.
             */

             StringBuilder sbb = new StringBuilder("hello");
             sbb.append("world");// you'll get all the methods of stringbuffer in stringbuilder as well.

             /* When to use == (Operator) and equals() methods to compare Strings
                System.out.println(a.equals(b)); used to compare content present is the 2 strings.
                System.out.println(a==b); used to compare object reference of 2 strings.
              */
        }
    
}
