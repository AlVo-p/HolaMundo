import java.util.Scanner;

public class M {
    public static void main(String[] args) throws Exception {
    
        /*
        private int edad=18;
        private double estatura=1.70;
        private char sexo='M';
        private boolean aprobado=true;
        String nombre = "Alexander Vanegas";
        String saludo = "Hola, " + nombre;
        double precio=9.99;
        int precioCortado = (int) precio;
    
        int entero = 5;
        double decimal = entero;
    }
        
    Scanner sc = new Scanner(System.in)) {
        System.out.print("Numero 1:");
        double a=sc.nextDouble();

        System.out.print("Operación(+,-,*,/):");
        char op=sc.next().charAt(0);

        System.out.print("Número 2: ");
        double b=sc.nextDouble();

        double resultado;
        
        switch (op) {
            case '+':
                resultado=a+b;
                System.out.println(resultado);
                break;
            case '.':
            resultado=a-b;
            System.out.println(resultado);
            break;
            case '*':
                resultado=a*b;
            System.out.println(resultado);    
                break;
            case '/':
                resultado=a/b;
            System.out.println(resultado);    
                break;    
        }
    }
}
}
*/ 
 
 Scanner sc = new Scanner(System.in);

   System.out.print("¿De qué número quieres la tabla?");
   int numero = sc.nextInt();

   System.out.println("\nTabla del " + numero + ":");
   for (int i = 1; i<= 10;i++); {
        System.out.println(numero + "x" + i + " = " + (numero * i));

   }
   sc.close();
 }


