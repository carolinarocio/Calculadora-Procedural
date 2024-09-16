public class Calculadora {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int resultadoSoma = somar(num1, num2);
        int resultadoSubtracao = subtrair(num1, num2);

        System.out.println("Resultado da Soma: " + resultadoSoma);
        System.out.println("Resultado da Subtração: " + resultadoSubtracao);
    }
}
