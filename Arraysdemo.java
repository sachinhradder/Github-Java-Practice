/**
 * Arraysdemo
 */
public class Arraysdemo {

    public static void main(String[] args) 
    {
        int a[] = new int[5]; // Declearing an array and difining the size of an array.
// Arrays definition:- a container which sotres multiple values of the same date types is called as an array.

        a[0] = 12;
        a[1] = 13;
        a[2] = 87;
        a[3] = 32;
        a[4] = 21; // initializing value into an array

        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]); // iteratiing over the arrays using for loop
        }

        
    }
}

    
