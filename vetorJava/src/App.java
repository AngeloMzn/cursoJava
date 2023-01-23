import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Digite o tamanho do vetor: ");
        n = sc.nextInt();

        int[] vet = new int[n];

        //adcionar numeros ao vetor
        for(int i = 0; i < n; i++)
        {
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextInt(); 
        }
        //printar cada posição do vetor
        for(int i = 0; i < n; i++)
        {
            System.out.println(vet[i]);
        }

    }
}
