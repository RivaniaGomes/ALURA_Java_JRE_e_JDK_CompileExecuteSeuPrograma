
public class TestaConversao {
	public static void main(String[] args) {
		float pontoFlutuante = 3.14f; // tem que colocar o f no final
		System.out.println(pontoFlutuante);
		
		double salario = 1270.50;
		int valor = (int) salario; // casting - fazer a conversao de tipos para que seja possivel compilar

		System.out.println(valor);

		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;

		System.out.println(total);
	}
}
