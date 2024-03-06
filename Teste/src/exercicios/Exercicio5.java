package exercicios;

public class Exercicio5 {
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
