import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

public class HashtableDemo {

public static void main(String args[]) {
	int a = 0, b = 0, c = 0, d = 0, e = 0;
	
	a = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero"));
	b = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));
	c = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro numero"));
	d = Integer.parseInt(JOptionPane.showInputDialog("Insira o quarto numero"));
	e = Integer.parseInt(JOptionPane.showInputDialog("Insira a quinto numero"));

	System.out.println("Ordem crescente");
	int[] numbers = { a, b, c, d, e };
	Arrays.sort(numbers);
	for (int num : numbers) {
	System.out.println(num); 
	}
   }
}