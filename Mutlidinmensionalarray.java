public class Mutlidinmensionalarray 
{

    public static void main(String[] args) 
    {
        int a[][] = new int[2][3];

        // a[row][column]

        a[0][0] = 2;
        a[0][1] = 4;
        a[0][2] = 5;
        a[1][0] = 3;
        a[1][1] = 4;
        a[1][2] = 7;

        /* another way to define 2 dimensional array is 

        int b[][] = {{2,4,5}, {3,4,7}, {5,2,1}} */


        //System.out.println(a[1][0]);

        for (int i=0; i<2; i++) // Outer for loop stands for row
        {

            for(int j=0; j<3; j++) // Inner for loop stands for column
            {
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
    
}
