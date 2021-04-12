public class TestaFatorial {
    public static void main(String[] args) {
        // fatorial regra será sempre o numero vezes seus numeros anteriores ex fatorial de 2 é 1*2 . de 3 é 3*2
        int fatorial = 1;
        for( int i= 1; i < 11; i++){
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " +fatorial);
        }
    }
}
