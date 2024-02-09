import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.Scanner;

public class Vendedor {
	public static void main( String[] args ) {
	Scanner ler = new Scanner(System.in);
	
	class Funcionario {
		
        int nascimento;
        double salario;
		double desconto;

        // ..
    }
		 int a = 0, b = 0, r = 0, x = 0;
		 String n;
		 x = Integer.parseInt(JOptionPane.showInputDialog("O que voce deseja fazer 1)Criar Vendedor 2)Realizar calculo de comissao de vendedor 3)exibir vendedor 4)sair"));

		  if ( x == 1) {
			Funcionario testeFuncionario; 
			testeFuncionario = new Funcionario();
			
			System.out.println("Insira o nome: ");
			n = ler.nextLine();
			testeFuncionario.nascimento = Integer.parseInt(JOptionPane.showInputDialog("Insira data de nascimento"));
			testeFuncionario.salario = Integer.parseInt(JOptionPane.showInputDialog("Insira o Salario"));
			testeFuncionario.desconto = (8 * testeFuncionario.salario)/100;
			
			 x = Integer.parseInt(JOptionPane.showInputDialog("O que voce deseja fazer 1)Criar Vendedor 2)Realizar calculo de comissao de vendedor 3)exibir vendedor 4)sair"));
			 
			 if ( x == 2) {
				a = Integer.parseInt(JOptionPane.showInputDialog("qual o valor de vendas?"));
				System.out.println("Comissao: " + a*(0.03+(testeFuncionario.salario * 0.00001)));
			  }
			 if ( x == 3) {
				System.out.println("nome: " + n);
				System.out.println("nascimento: " + testeFuncionario.nascimento);
				System.out.println("Salario: " + testeFuncionario.salario);
				System.out.println("Desconto de: " + testeFuncionario.desconto);
				
			  }
			 if ( x == 4) {
				System.out.println("Fim");
				System.exit(0);
			  }
		  }
	}
}