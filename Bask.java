import javax.swing. *;
import java.awt. *;
import java.awt.event. *;
import java.lang.Math;

public class Bhaskara extends JFrame{
	JLabel rotulo1,rotulo2, rotulo3, exibir, exibir2;
	JTextField texto1,texto2, texto3;
	JButton calcular;
	public Bhaskara(){
		super("Formula de bhaskara");
		Container tela = getContentPane();
		setLayout(null);
		
		rotulo1 = new JLabel ("a: ");
		rotulo2 = new JLabel ("b: ");
		rotulo3 = new JLabel ("c: ");
		
		texto1 = new JTextField(5);
		texto2 = new JTextField(5);
		texto3 = new JTextField(5);
		
		exibir = new JLabel("");
		exibir2 = new JLabel("");
		calcular = new JButton("Calcular");
		
		rotulo1.setBounds(50,20,100,20); 	
		rotulo2.setBounds(50,60,100,20);
		rotulo3.setBounds(50,100,100,20);
		
		texto1.setBounds(120,20,200,20);    
		texto2.setBounds(120,60,200,20);
		texto3.setBounds(120,100,200,20);
		
		exibir.setBounds(120,180,50,20);
		exibir2.setBounds(120,220,50,20);	
		
		calcular.setBounds(150,140,150,20);
	
calcular.addActionListener(
		new ActionListener(){
		 public void actionPerformed(ActionEvent e){
		 double a,b,c, delta, x1, x2;
		 
		 a = Integer.parseInt(texto1.getText());
		 b = Integer.parseInt(texto2.getText());
		 c = Integer.parseInt(texto3.getText());
		 delta = b*b - 4.0 * a * c;
		  
		 x1 = (-b + Math.sqrt(delta))/(2*a);
		 x2 = (-b - Math.sqrt(delta))/(2*a);
		 
		 exibir.setVisible(true);
		 exibir.setText("x': " + x1);
		 exibir2.setVisible(true);
		 exibir2.setText("x'': " + x2);
							}
			}
		 );
exibir.setVisible(false);		 
		tela.add(rotulo1); 
		tela.add(rotulo2);
		tela.add(rotulo3);
		
		tela.add(texto1);  
		tela.add(texto2);
		tela.add(texto3);
		
		tela.add(exibir);	
		tela.add(exibir2);
		
		tela.add(calcular);
		
		setSize(400, 400);
		setVisible(true);

	}
	public static void main(String args[]){
		Bhaskara app = new Bhaskara();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}