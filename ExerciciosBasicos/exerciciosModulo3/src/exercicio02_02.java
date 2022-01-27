
public class exercicio02_02 {
	//2. Imprima a soma dos números de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.). 
	
	public static void main(String[] args){
		//2.
		int somaNum = 1;
		for(int i= 0; somaNum <= 100; i++ ) {
			System.out.println(somaNum);
			somaNum = somaNum + 2;
		}
	}
}
