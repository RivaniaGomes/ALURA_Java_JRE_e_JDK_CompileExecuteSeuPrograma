public class TestaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10; //não altera o segundo, pois já foi alterado de primeiro pra 5
		System.out.println(segundo);
	}
}