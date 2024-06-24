import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int primeiroNumero = terminal.nextInt();
            
            System.out.println("Digite o segundo parâmetro");
            int segundoNumero = terminal.nextInt();
		
			//chamando o método contendo a lógica de contagem
			contar(primeiroNumero, segundoNumero);
		
		} catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O primeiro dígito é maior do que o segundo...");
		} catch (InputMismatchException exception) {
            System.out.println("A entrada precisa ser um algarismo númerico...");
        }
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
         
        int contagem = parametroDois - parametroUm;
        
		//realizar o for para imprimir os números com base na variável contagem		
		for(int i = 1; i <= contagem; i++) {
			System.out.print(i + " ");
		}
	}
}
