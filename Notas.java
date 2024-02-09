import javax.swing.JOptionPane;

public class Notas {
	public static void main( String[] args ) {
	int a = 0, b = 0, c = 0, d = 0, f = 0;

	a = Integer.parseInt(JOptionPane.showInputDialog("Insira a primeira nota do aluno"));
	b = Integer.parseInt(JOptionPane.showInputDialog("Insira a segunda nota"));
	c = Integer.parseInt(JOptionPane.showInputDialog("Insira a terceira nota"));
	d = Integer.parseInt(JOptionPane.showInputDialog("Insira a quarta nota"));
	f = (a + b + c + d)/4;

	if ( f >= 7 ) {
	  	System.out.println("Aprovado");
	  }
	if ( f < 3) {
	  	System.out.println("Retido");
	  }
	if ( f >= 3 && f < 7) {
	  	System.out.println("Exame");
	  }
	}
}
