public class Fundamentos_string {
    /*  METODO 1
    public static void main(String[] args) {
        String nome = "Atlas";
        System.out.println("Seu nome é: " + nome);
    }
*/
//METODO 2
    public static String frase(String nome){return "Seu nome é: " + nome;}

    public static void main(String[] args) {
        System.out.println(frase("John"));
    }
}
