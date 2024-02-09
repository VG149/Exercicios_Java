import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

public class HashtableDemo {

public static void main(String args[]) {
	int a = 0, b = 0, c = 0, d = 0, e = 0;
	
	a = Integer.parseInt(JOptionPane.showInputDialog("Insira a primeira nota do aluno"));
	b = Integer.parseInt(JOptionPane.showInputDialog("Insira a segunda nota"));
	c = Integer.parseInt(JOptionPane.showInputDialog("Insira a terceira nota"));
	d = Integer.parseInt(JOptionPane.showInputDialog("Insira a quarta nota"));
	e = Integer.parseInt(JOptionPane.showInputDialog("Insira a quinta nota"));

	System.out.println("Classificando parte do Array em Java:");
	int[] numbers = { a, b, c, d, e };
	Arrays.sort(numbers, Collections.reverseOrder());
	System.out.println("Sub Array Classificado em Java: ");
	for (int num : numbers) {
	System.out.println(num); 
	
	
	}
   }
}