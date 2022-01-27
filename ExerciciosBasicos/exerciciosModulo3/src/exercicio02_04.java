
public class exercicio02_04 {

	public static void main(String[] args) {
		//4. Imprima a tabuada do 9 (até o décimo valor). 
		int  cont = 0; //contagem de numero da tabuada

		
		for (int i = 0; cont < 11; i++) { // 9
			if(i%9 == 0) { // cont => x 0, 1, 2, 3 ...
				
				System.out.println("9 x " + cont  + " = " + i);
				cont++;
			}
		
		}

	}

}
