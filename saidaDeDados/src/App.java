public class App 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Bom dia"); // print com quebra de linha
        System.out.println("Boa noite");

        int x, y; 
        
        x = 10;
        y = 20;
        
        System.out.println(x); // print de variaveis
        System.out.println(y);
        
      
        double z;
        
        z = 2.8438;
        
        System.out.println(String.format("%.2f", z)); // print formatando o double com 2 casas decimais

       
        int idade;
        double salario;
        String nome;
        char sexo;

        idade = 22;
        salario = 3500.55678;
        nome = "Juliana";
        sexo = 'F';

        System.out.println("A funcionaria " + nome + ", sexo " + sexo + ", ganha " + String.format("%.2f", salario) + " e tem " + idade + " anos"); // print com concatenação misturando string com variaveis


    }
}
