    class Programa {    
        public static void main(String[] args) {
	class Funcionario {
		String nome;
        int nascimento;
        double salario;
		double desconto;

        // ..
    }
            Funcionario testeFuncionario; 
            testeFuncionario = new Funcionario();

            testeFuncionario.nome = "Jorgin";
			testeFuncionario.nascimento = 1997;
            testeFuncionario.salario = 4000.0;
			testeFuncionario.desconto = (8 * testeFuncionario.salario)/100;
			
			System.out.println("nome: " + testeFuncionario.nome);
			System.out.println("nascimento: " + testeFuncionario.nascimento);
            System.out.println("Salario: " + testeFuncionario.salario);
			  System.out.println("Desconto de: " + testeFuncionario.desconto);
        }
    }
