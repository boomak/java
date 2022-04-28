public class ExerciseClassName
{

    int rows;

    ExerciseClassName(int rows)
    {
        this.rows=rows;
    }


    int[][] generateTriangle()
    {
        int[][] arr= new int[rows][rows];
        int coe=1;

        for(int i = 0; i < rows; i++)
        {

            for(int j = 0; j <= i; j++)
            {
                if (j == 0 || i == 0)
                    coe = 1;
                else
                    coe = coe * (i - j + 1) / j;
                arr[i][j]=coe;


            }

        }
        return arr;
    }

}
