package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numeroInformado = scanner.nextInt();

        if (verificarFibonacci(numeroInformado)) {
            System.out.println(numeroInformado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numeroInformado + " não pertence à sequência de Fibonacci.");
        }
    }

    static boolean verificarFibonacci(int numero) {
    	if(numero == 0 || numero == 1) {
    		return true;
    	}
    	
        int a = 0, b = 1;

        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b == numero;
    }
}
