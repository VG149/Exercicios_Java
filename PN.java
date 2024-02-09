import javax.swing.JOptionPane;

public class NegaOuPosit {
	public static void main( String[] args ) {
	int x = 0;

	x = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero"));

	if (x > 0) {
	  	System.out.println("Numero positivo: " + x);
	}
	if (x < 0) {
		System.out.println("Numero negativo: " + x);
	}
	if (x == 0) {
		System.out.println("Numero igual a 0 ");
	}
	
}
}