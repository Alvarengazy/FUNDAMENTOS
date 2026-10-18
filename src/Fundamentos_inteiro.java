public class Fundamentos_inteiro {

/*  METODO 1
    public static int somar (int a, int b) {
            return a + b;
    }

    public static void main(String[] args) {
        int resultado = somar(9, 2);

        System.out.println("O resultado da soma é: " + resultado);
    }
 */

// METODO 2
 
public static int somar(int a, int b) { return a + b;}
public static int subtrair(int a, int b){ return a - b;}
public static int dividir(int a, int b){ return a / b;}
public static int multiplicar(int a, int b){ return a * b;}

public static void main(String[] args) {
    System.out.println(somar(5, 3));
    System.out.println(subtrair(6, 2));
    System.out.println(dividir(10, 5));
    System.out.println(multiplicar(10, 10));
} 

}