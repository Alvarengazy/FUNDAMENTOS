public class Fundamentos_double {
/* METODO 1
    public static double somar(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        double resultado = somar(9.5, 9.5);
    }
*/
// METODO 2

public static double somar (double a, double b) {return (a + b) /3;}
public static double subtrair (double a, double b) {return (a - b) /9;}
public static double multiplicar (double a, double b) {return a * b /2;}
public static double dividir(double a, double b){return a / b;}

public static void main(String[] args) {
    System.out.println(somar(10, 10));
    System.out.println(subtrair(55, 6));
    System.out.println(multiplicar(15, 17));
    System.out.println(dividir(10, 3));
}
}
