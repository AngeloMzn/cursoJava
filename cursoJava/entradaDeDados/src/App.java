import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        // para int a = sc.nextInt();
        // para double a = sc.nextDouble();
        // para char a = sc.next().charAt(0) 
        // para String a = sc.nextLine();
        int idade;
        String nome;
        
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        
        System.out.println("Digite seu nome: ");
        sc.nextLine(); //limpeza de buffer
        nome = sc.nextLine();

        System.out.println("nome: " + nome + "\nidade: " + idade);

    }
}
