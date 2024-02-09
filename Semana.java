import javax.swing.JOptionPane;

public class Semana {
	public static void main( String[] args ) {
	int d = 0;

	d = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero de 0 a 6"));
	switch( d ) {
	 case 0 :
	   System.out.println("Domingo");
	   break;
	 case 1 :
	   System.out.println("Segunda-Feira");
	   break;
	 case 2 :
	   System.out.println("Terca-Feira");
	   break;
	 case 3 :
	   System.out.println("Quarta-Feira");
	   break;
	 case 4 :
	   System.out.println("Quinta-Feira");
	   break;
	 case 5 :
	   System.out.println("Sexta-Feira");
	   break;
	 case 6 :
	   System.out.println("Sabado");
	   break;
	}
	}
}