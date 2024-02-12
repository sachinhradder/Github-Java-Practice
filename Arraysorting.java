public class Arraysorting 
{

    public static void main(String[] args) 
    {

        int a[] = {2,6,4,1,9};

        // sorting the above array using bubble sort mechanism where we take one value and compare it with all other values

        // Output should be 1,2,4,6,9 this should be the order after sorting the array.

        int temp;
        for (int i=0; i<a.length; i++)
        {
            for (int j=i+1; j<a.length; j++)
            {
                if (a[i]> a[j])
                {
                    // swap
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }



        /* swapping of 2 number first we will solve this question

        int b = 4;
        int c = 5;
        int temp;

        temp = b;
        b = c;
        c = temp;

        System.out.println(b);
        System.out.println(c); */

        /* swapping number without using third variable 
        

        int b = 5;
        int c = 4;

       b = b+c; // Now the value of b = 9
       c = b-c; //Now the value of c = 5
       b = b-c; //Now the value of b = 4

       System.out.println(b);
       System.out.println(c); */
        
    }
    
}
