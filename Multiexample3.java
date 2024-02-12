public class Multiexample3 
{

      /*   
           81 71 10
           12 14 13
           11 21 91
//  Print the maximum value from the above matrix
         */

         public static void main(String[] args) 
         {

            int b[][] = {{81,71,10},{12,141,13},{11,21,91}};

            int max = b[0][0];

            for(int i=0; i<3; i++)
            {
                for(int j=0; j<3; j++)
                {
                    if(b[i][j]>max)
                    {
                        max=b[i][j];
                    }
                }
            }
            System.out.println("The maximum value from the above matrix is " + max);
            
         }
    
}
