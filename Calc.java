import javax.swing.JOptionPane;

public class Calc {
	public static void main( String[] args ) {
	 int a = 0, b = 0, r = 0, x = 0;

	 a = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
	 b = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));
	 x = Integer.parseInt(JOptionPane.showInputDialog("Qual conta você deseja fazer 1)Soma 2)Subtração 3)Divisão 4)Multiplicação 5)Resto de divisão 6)Dobro 7)quadrado 8)cubo 9)raiz quadrada 0)sair"));

	  if ( x == 1) {
	  	r = a + b;
	  	System.out.println("Resultado: " + r);
	  }
	  if ( x == 2) {
	  	r = a - b;
	  	System.out.println("Resultado: " + r);
	  }
	  if ( x == 3) {
	  	r = a/b; 
	  	System.out.println("Resultado: " + r);
	  }
	  if ( x == 4) {
	  	r = a * b;
	  	System.out.println("Resultado: " + r);
	  }
	  if ( x == 5) {
	  	r = a % b;
	  	System.out.println("Resultado: " + r);
	  }
	  if ( x == 6) {
	  	r = a * 2;
	  	System.out.println("Resultado: " + r);
	  }
	  if ( x == 7) {
	  	r = a * a;
	  	System.out.println("Resultado: " + r);
	  }
	  if ( x == 8) {
	  	r = 3,1 * a ^ 2;
	  	System.out.println("Resultado: " + r);
	  }
	  if ( x == 9) {
	  	r = Math.sqrt(a);
	  	System.out.println("Resultado: " + r);
	  }
	}
}