import javax.swing.JOptionPane;

public class Idade {
	public static void main( String[] args ) {
	 int valor = 0;

	 valor = Integer.parseInt(JOptionPane.showInputDialog("Insira valor"));

	  if ( valor >= 100) {
	  	System.out.println("Maior que 100");
	  }
	  if ( valor <= 15) {
	  	System.out.println("Menor que 15");
	  }
	  if ( valor >=15 && valor<=100) {
	  	System.out.println("Não esta dentro da sugestão");
	  }
	}
}