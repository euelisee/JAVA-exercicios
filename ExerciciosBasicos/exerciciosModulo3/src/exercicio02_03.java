import java.util.Iterator;

public class exercicio02_03 {

	public static void main(String[] args) {
		//3. Come�ando em 0, imprima os n�meros seguintes, enquanto a soma dos n�meros j� impressos for menor que 100.
		int num = 0;
		
		for (int i = 0; i + num < 100; i++) {
			System.out.println(i); // imprime i pq ele que vai fazer a soma com o num, ou seja, na primeira vez que passar pelo for o i = 1 e o num = 0 e
								// na segunda vez num vale 1 e i vale 2 fazendo a soma e comparando se � menor que 100 e imprime.
			num = num + i ;
			
		}

	}

}
