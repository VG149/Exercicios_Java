import javax.swing.JOptionPane;

public class Tabuada {
	public static void main( String[] args ) {

	int tabuada, x; 
	tabuada = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero"));
		
	for(x = 0; x <= 10; x++)
	   System.out.println( x * tabuada);
 }
}