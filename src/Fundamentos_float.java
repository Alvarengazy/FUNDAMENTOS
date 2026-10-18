public class Fundamentos_float {
    /* METODO 1
    public static void main(String[] args) {
        float peso = 75.8f;

        System.out.println("Seu peso é " + peso);
    }
*/
//METODO 2
    public static float peso(){return 75.8f;}

    public static void main(String[] args) {
        System.out.println("Seu peso é " + peso() + "kg");
    }
}
