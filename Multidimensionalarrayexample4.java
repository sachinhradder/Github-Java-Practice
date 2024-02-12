public class Multidimensionalarrayexample4 
{

    /* problem

    2 11 5 
    3 4  7 
    1 0  9

    find out the maximum number in the above matrix, first you need to find out the min number in the matrix and then 
    you have to find out the maximum no of that column. based on this logic the output should be 11 */
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
    int abc[][] = {{2,11,5},{3,4,7},{1,0,9}};

    int min = abc[0][0];
    int mincolumn = 0;
    
    for (int i=0; i<3; i++)
    {
        for (int j=0; j<3; j++)
        {
            if(abc[i][j]<min)
            {
                min = abc[i][j];
                mincolumn = j;
            }
        }
    }
    System.out.println("The minimum no is "+ min);
    int max = abc[0][mincolumn];
    int k=0;
    while (k<3) 
    {
     if(abc[k][mincolumn]>max)
     {
        max = abc[k][mincolumn];
        
     }
     k++;
    }
    System.out.println("The max value in the column is "+max);
}
}