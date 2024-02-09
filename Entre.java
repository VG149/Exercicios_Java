import javax.swing.JOptionPane;

public class Idade {
	public static void main( String[] args ) {
	 double valor = 0.00;

	 valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor entre 1.99 e 5.99"));

	  if ( valor <= 5.99 && valor >= 1.99) {
	  	System.out.println("esta entre 1.99 e 5.99");
	  }
	  else {
	  	System.out.println("Não esta entre os valores citados");
	  }
	}
}