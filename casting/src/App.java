public class App {
    public static void main(String[] args) throws Exception 
    {
        //processamento de dados
        int x;
        double y;
        x = 5;
        y = 2 * x;
        System.out.println(x);
        System.out.println(String.format("%.1f", y));    
    
        double b1, b2, h, area;
        b1 = 6.0;
        b2 = 8.0;
        h = 5.0;
        area = (b1 + b2) / 2.0 * h;
        System.out.println(area);   
        
        //casting
        double a;
        int b;
        a = 5.0;
        b = (int) a;
        System.out.println(b); 
    
    }
}
