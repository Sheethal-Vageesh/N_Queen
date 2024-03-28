package board;

public class Board 
{
    public int size;
    public char matrix[][];

    public Board(int size)
    {
        this.size=size;
        this.matrix=new char[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
               this.matrix[i][j]='-';
            }
        }
    }

    public void printBoard()
    {
        for(int i=0;i<this.size;i++)
        {
          for(int j=0;j<this.size;j++)
          {
            System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
        }
    }

}
