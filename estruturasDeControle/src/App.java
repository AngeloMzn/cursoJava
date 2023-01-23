public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // Simples if(condição){codigo}
        // Composta if(condição){codigo}else{codigo}
        // Encadeamento if(condição){codigo}elseif(condição2){codigo}else{codigo}

        int a, b;
        b = 2;
        a = 3;
        if(a > 0)
        {
            System.out.println(b);
        }
        
        //while(condição){codigo}
        while(a > 0)
        {
            System.out.println(b);
            a--;
        }

        //for(inicio; condição; incremento){codigo}
        for(int c = 0; c < b; c++)
        {
           System.out.println(a);
        }


    }
}
