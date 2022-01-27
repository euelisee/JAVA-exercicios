

public class notaAlunos {
	public static void main(String[] args) {
		double nota1 = 8.5;
		double nota2 = 7.5;
		double nota3 = 6.0;
		
		int peso1 = 3;
		int peso2 = 2;
		int peso3 = 5;
		
		//nota parcial conforme o peso 
		double parcial1 = nota1 * peso1;
		double parcial2 = nota2 * peso2;
		double parcial3 = nota3 * peso3;
		
		//media do aluno
		
		double media = (parcial1 + parcial2 + parcial3)/(peso1 + peso2 + peso3) ;
		if (media >= 6) {
			System.out.println ("A media é: "+ media + "  Aluno aprovado");
		}else {
			System.out.println ("A media é: "+ media + "  Aluno reprovado");
		}
	}

}
