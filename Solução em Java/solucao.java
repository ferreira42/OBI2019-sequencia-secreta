import java.util.Scanner;

public class solucao {

    /*
     * Focando na restrição do problema, qual define que a sequência de números
     * marcados não pode conter dois números iguais consecutivos, meu raciocínio
     * central constituiu de progressivamente comparar os valores da sequência com
     * seu sucessor. Caso o resultado da comparação for falso, isto é, o número
     * sucessor difere do número anterior, o valor da sequência máxima é
     * incrementada e o resultado é apresentado ao finalizar a iteração na sequência.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tamanhoSequencia, sequenciaMaxima = 0;


        // Armazena o tamanho máximo da sequência
        tamanhoSequencia = in .nextInt();
        // Array que armazenará a sequência de números
        int[] sequenciaDeNumeros = new int[tamanhoSequencia + 1];

        // Loop que adiciona a sequência ao array
        for (int index = 0; index < tamanhoSequencia; index++) {
            sequenciaDeNumeros[index] = in .nextInt();
        }

        // Iteração na sequência de números
        for (int index = 0; index < sequenciaDeNumeros.length - 1; index++) {
            // Operador condicional ternário
            // Verifica se o valor atual iterado é igual ao seu sucessor
            boolean comparacao = (sequenciaDeNumeros[index] == sequenciaDeNumeros[index + 1]) ? true : false;
            if (!comparacao) {
                sequenciaMaxima += 1;
            }
        }
        // Saída do resultado contendo a sequência máxima
        System.out.println(sequenciaMaxima);
    }
}