import java.util.Scanner;

public class MainCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//criando classes com os me�todos
        soma soma = new soma();  
        sub sub = new sub(); 
        mult mult = new mult(); 
        div div = new div(); 
        //declarando as var�aveis  
        int opcao = 5;  
        int num1;  
        int num2;  
		
        Scanner input = new Scanner(System.in);
        System.out.println("-Escolha uma op��o-	\r\n"
        		+ "		\"1.Adicao\r\n"
        		+ "		\"2.Subtra��o\r\n"
        		+ "		\"3.Multiplica��o\r\n"
        		+ "		\"4.Divis�o\r\n"
        		+ "		\"0.sair\r\n"
        		+ "		\r\n"
        		+ "");  
       
        opcao = input.nextInt();  
          
        while (opcao != 5) {
			Scanner input1 = new Scanner(System.in); 
			
			if (opcao == 0) {
           	 System.out.println("Bye bye!");
           	 break;
            }
			
			System.out.println("Qual o primeiro numero: ");  
			num1 = input1.nextInt();  
			System.out.println("Qual o segundo numero: ");  
			num2 = input1.nextInt();

			 if ( opcao == 1 ) {
				int operacao = soma.soma(num1, num2);
                System.out.printf("\nO resultado da soma �: %d\n", operacao);  
                break;  
            }  
            else if (opcao == 2) { 
				int operacao = sub.sub(num1, num2);
				System.out.printf("\nO resultado da subtra��o �: %d\n", operacao);  
				break;  
			}  
			else if (opcao == 3) {
				int operacao = mult.mult(num1, num2); 
				System.out.printf("\nO resultado da multiplica��o �: %d\n", operacao);    
				break;  
			} 
			else  {  
				int operacao = div.div(num1, num2);  
				System.out.printf("\nO resultado da divis�o �: %d\n", operacao);   
				break;  
			}  
		
	   }
   }
}
