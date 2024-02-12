public class Multidimensionalexample2 
{

    public static void main(String[] args) 
    {

        /* 2 4 5
           3 4 7
           1 2 9
//  Print the minimum value from the above matrix
         */

         int a[][] = {{2,4,5},{3,0,7},{1,2,9}};

         int minimumnumber = a[0][0];
         for (int i=0; i<3; i++)
         {
            for (int j=0; j<3; j++)
            {
                if(a[i][j]<minimumnumber)
                {
                    minimumnumber = a[i][j];
                    
                }
            }
         }
         System.out.println("Minium value in the above matrix is "+ minimumnumber);
    }
    
}
