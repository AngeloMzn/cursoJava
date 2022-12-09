import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int m, n;
        
        System.out.println("digite o numero m de linhas: ");
        m = sc.nextInt();

        System.out.println("digite o numero n de colunas: ");
        n = sc.nextInt();
        
        //criando a matriz
        int[][] mat = new int[m][n];

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.println("elemento [" + i + ", " + j + "]");
                mat[i][j] = sc.nextInt();
            }
        }
        // printando a matriz
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
