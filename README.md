## Redação

Eu acredito que as tecnologias automatizadas representam não apenas a inovação do presente, mas também desempenharão um papel crucial no futuro. 
A automação de processos repetitivos não apenas impulsiona a eficiência operacional, mas também se apresenta como a solução para uma variedade de desafios em diversos setores.

No entanto, é fundamental abordar essa revolução tecnológica com cautela, especialmente quando aplicada em contextos sensíveis, como em processos seletivos. 
Embora a automação ofereça vantagens notáveis, é crucial considerar a ética envolvida, pois a padronização excessiva pode resultar em decisões injustas e prejudicar a diversidade. 
Portanto, ao adotar essas inovações, é fundamental estabelecer salvaguardas éticas que garantam que a automação seja implementada de maneira justa e equitativa.

Assim, ao vislumbrarmos o papel transformador da automação, devemos simultaneamente nutrir a consciência ética para assegurar que as vantagens proporcionadas por essas tecnologias se traduzam em benefícios inclusivos e sustentáveis para a sociedade como um todo.

## Teste técnico ( RESPOSTAS )
OBS: A linguagem escolhida foi Java.

1) 91
```
package exercicios;

public class Exercicio1 {
	public static void main(String[] args) {
		int INDICE = 13, SOMA = 0, K =0;
		while(K < INDICE) {
			K = K + 1;
			SOMA = SOMA + K;
		}
		System.out.println("O VALOR DA SOMA: "+SOMA);
		
	}
}
```
2)
```
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
```
3) a) 9
   b) 128
   c) 49
   d) 100
   e) 13
   f) 200

4) Ligaria o primeiro interruptor e esperia um pouco, depois iria na sala ver qual das lâmpadas está quente/morna
    Depois de um tempo, ligaria o segundo interruptor e faria o mesmo passo que fiz na primeira, descobrindo assim a segunda lâmpada
    Por eliminação, encontraria a terceira lâmpada

5)
 ```
  public class InverterString {
    public static String inverterString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // Exemplo de uso:
    public static void main(String[] args) {
        String entrada = "Hello, World!";
        String saida = inverterString(entrada);
        System.out.println(saida);
    }
}
 ```


## Teste técnico ( PREGUNTAS )

1) Observe o trecho de código abaixo:

int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);



Ao final do processamento, qual será o valor da variável SOMA?



2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.



IMPORTANTE:

Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;



3) Descubra a lógica e complete o próximo elemento:



a) 1, 3, 5, 7, ___

b) 2, 4, 8, 16, 32, 64, ____

c) 0, 1, 4, 9, 16, 25, 36, ____

d) 4, 16, 36, 64, ____

e) 1, 1, 2, 3, 5, 8, ____

f) 2,10, 12, 16, 17, 18, 19, ____



4) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.

Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

 

5) Escreva um programa que inverta os caracteres de um string.


IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;
