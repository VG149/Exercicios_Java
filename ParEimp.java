import javax.swing.JOptionPane;

public class Semana {
	public static void main( String[] args ) {
	int x = 0;

	x = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));


	if (x % 2 == 0) {
	  	System.out.println("Numero par");
	  }
	else {
		System.out.println("Numero impar");
	}
  }
}