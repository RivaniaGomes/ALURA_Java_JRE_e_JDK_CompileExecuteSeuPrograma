public class TestaWhile {

	public static void main(String[] args) {
		int contador = 0;
		while (contador <= 10) {
			System.out.println(contador);
			// contator = contator + 1
			// contador += 1;
			contador++; //mais usado!
			//++contador; (o pré-incremento) 
		}
		System.out.println(contador);

	}
}