import javax.swing.JOptionPane;

public class Diferenca {
	public static void main( String[] args ) {
	int a = 0, b = 0, c = 0, d = 0;
	
	a = Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor: "));
	b = Integer.parseInt(JOptionPane.showInputDialog("Segundo valor: "));
	c = a - b;
	d = b - a;
	
	if ( a > b ) { 
		System.out.println("A diferenca entre os valores é de: " +c);
		}
	else {
	System.out.println("A diferenca entre os valores é de: " +d);
		}
	}
}